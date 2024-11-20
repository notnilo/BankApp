package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Account;
import core.models.storage.Storage;
import core.models.transactions.Transaction;
import core.models.transactions.TransactionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author notnilo
 */
public class TransactionController {

    public static Response createTransaction(String type, String sourceAccountId, String destinationAccountId, String amount) {
        try {
            Storage storage = Storage.getInstance();
            if (amount.equals("")) {
                return new Response("Amount cannot be empty", Status.BAD_REQUEST);
            }
            double cant = Double.parseDouble(amount);
            if (cant <= 0) {
                return new Response("The amount must be greater than zero", Status.BAD_REQUEST);
            }
            switch (type) {
                case "Deposit" -> {
                    if (!sourceAccountId.equals("")) {
                        return new Response("Source account must be empty", Status.BAD_REQUEST);
                    }
                    if (destinationAccountId.equals("")) {
                        return new Response("Destination account must not be empty", Status.BAD_REQUEST);
                    }
                    Account destinationAccount = null;
                    for (Account account : storage.getAccounts()) {
                        if (account.getId().equals(destinationAccountId)) {
                            destinationAccount = account;
                        }
                    }
                    if (destinationAccount == null) {
                        return new Response("Destination account not found", Status.NOT_FOUND);
                    }
                    destinationAccount.deposit(cant);
                    storage.addTransaction(new Transaction(TransactionType.DEPOSIT, null, destinationAccount, cant));
                    return new Response("Deposit done successfully", Status.CREATED);
                }
                case "Withdraw" -> {
                    if (sourceAccountId.equals("")) {
                        return new Response("Source account must not be empty", Status.BAD_REQUEST);
                    }
                    if (!destinationAccountId.equals("")) {
                        return new Response("Destination account must be empty", Status.BAD_REQUEST);
                    }
                    Account sourceAccount = null;
                    for (Account account : storage.getAccounts()) {
                        if (account.getId().equals(sourceAccountId)) {
                            sourceAccount = account;
                        }
                    }
                    if (sourceAccount == null) {
                        return new Response("Source account not found", Status.NOT_FOUND);
                    }
                    if (sourceAccount.withdraw(cant)) {
                        storage.addTransaction(new Transaction(TransactionType.WITHDRAW, sourceAccount, null, cant));
                        return new Response("Withdrawal done successfully", Status.CREATED);
                    } else {
                        return new Response("Not enough funds in source accounts for this transaction", Status.BAD_REQUEST);
                    }
                }
                case "Transfer" -> {
                    if (sourceAccountId.equals("")) {
                        return new Response("Source account must not be empty", Status.BAD_REQUEST);
                    }
                    if (destinationAccountId.equals("")) {
                        return new Response("Destination account must not be empty", Status.BAD_REQUEST);
                    }
                    Account sourceAccount = null;
                    Account destinationAccount = null;
                    for (Account account : storage.getAccounts()) {
                        if (account.getId().equals(sourceAccountId)) {
                            sourceAccount = account;
                        }
                    }
                    for (Account account : storage.getAccounts()) {
                        if (account.getId().equals(destinationAccountId)) {
                            destinationAccount = account;
                        }
                    }
                    if (sourceAccount == null) {
                        return new Response("Source account not found", Status.NOT_FOUND);
                    }
                    if (destinationAccount == null) {
                        return new Response("Destination account not found", Status.NOT_FOUND);
                    }
                    if (sourceAccount.withdraw(cant)) {
                        destinationAccount.deposit(cant);
                        storage.addTransaction(new Transaction(TransactionType.TRANSFER, sourceAccount, destinationAccount, cant));
                        return new Response("Transaction done successfully", Status.CREATED);
                    } else {
                        return new Response("Not enough funds in source accounts for this transaction", Status.BAD_REQUEST);
                    }
                }
                default -> {
                    return new Response("Invalid transaction type", Status.BAD_REQUEST);
                }
            }
        } catch (NumberFormatException ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response sortTransaction() {
        Storage storage = Storage.getInstance();

        ArrayList<Transaction> transactionsCopy = (ArrayList<Transaction>) storage.getTransactions().clone();
        Collections.reverse(transactionsCopy);

        return new Response("Sort completed", Status.OK, transactionsCopy);

    }

    public static DefaultTableModel showTransactions(Response response) {

        String[] columnNames = {"Type", "Source Account ID", "Destination Account ID", "Amount"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Transaction transaction : (List<Transaction>) response.getObject()) {

            if (transaction.getType() == TransactionType.DEPOSIT) {
                Object[] row = {
                    transaction.getType(),
                    "",
                    transaction.getDestinationAccount().getId(),
                    transaction.getAmount()
                };
                model.addRow(row);
            }
            if (transaction.getType() == TransactionType.WITHDRAW) {
                Object[] row = {
                    transaction.getType(),
                    transaction.getSourceAccount().getId(),
                    "",
                    transaction.getAmount()
                };
                model.addRow(row);
            }
            if (transaction.getType() == TransactionType.TRANSFER) {
                Object[] row = {
                    transaction.getType(),
                    transaction.getSourceAccount().getId(),
                    transaction.getDestinationAccount().getId(),
                    transaction.getAmount()
                };
                model.addRow(row);
            }
        }
        return model;
    }

}
