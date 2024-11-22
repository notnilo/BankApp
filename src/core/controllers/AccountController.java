/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.account.Account;
import core.models.user.User;
import core.models.storage.Storage;
import java.util.List;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author notnilo
 */
public class AccountController implements ControllerMethods{

    public static Response createAccount(String userId, String accountBalance) {

        try {
            int idInt;
            double aBalance;
            if (userId.equals("")) {
                return new Response("User Id must not be empty", Status.BAD_REQUEST);
            }
            if (accountBalance.equals("")) {
                return new Response("Account Balance must not be empty", Status.BAD_REQUEST);
            }
            try {
                idInt = Integer.parseInt(userId);
                if (idInt < 0) {
                    return new Response("Id must be positive", Status.BAD_REQUEST);
                }
                if (userId.length() < 9) {
                    return new Response("Id must have 9 digits", Status.BAD_REQUEST);
                }
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            User selectedUser = null;
            Storage storage = Storage.getInstance();
            for (User user : storage.getUsers()) {
                if (user.getId() == idInt && selectedUser == null) {
                    selectedUser = user;
                }
            }
            if (selectedUser == null) {
                return new Response("Id not found", Status.NOT_FOUND);
            }
            aBalance = Double.parseDouble(accountBalance);
            if (aBalance < 0) {
                return new Response("Account Balance must be greater than zero", Status.BAD_REQUEST);
            }
            Random random = new Random();
            int first = random.nextInt(1000);
            int second = random.nextInt(1000000);
            int third = random.nextInt(100);
            String accountId = String.format("%03d", first) + "-" + String.format("%06d", second) + "-" + String.format("%02d", third);
            storage.addAccount(new Account(accountId, selectedUser, aBalance));
            return new Response("Account created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public Response sort() {
        try {
            Storage storage = Storage.getInstance();
            storage.getAccounts().sort((obj1, obj2) -> (obj1.getId().compareTo(obj2.getId())));
            return new Response("Successful operation", Status.OK, storage.getAccounts());
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public DefaultTableModel show(Response response) {

        String[] columnNames = {"ID", "User ID", "Balance"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (Account account : (List<Account>) response.getObject()) {

            Object[] row = {
                account.getId(),
                account.getOwner().getId(),
                account.getBalance(),};
            model.addRow(row);
        }

        return model;
    }
}
