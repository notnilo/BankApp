/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.storage;

import core.models.Account;
import core.models.User;
import core.models.transactions.Transaction;
import java.util.ArrayList;

/**
 *
 * @author notnilo
 */
public class Storage {

    // Instancia Singleton
    private static Storage instance;

    // Atributos del Storage
    private final ArrayList<User> users;
    private final ArrayList<Account> accounts;
    private final ArrayList<Transaction> transactions;

    private Storage() {
        this.users = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public boolean addUser(User user) {
        for (User u : this.users) {
            if (u.getId() == user.getId()) {
                return false;
            }
        }
        this.users.add(user);
        return true;
    }

    public User getUser(int id) {
        for (User u : this.users) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public boolean addAccount(Account account) {
        for (Account a : this.accounts) {
            if (a.getId().equals(account.getId())) {
                return false;
            }
        }
        this.accounts.add(account);
        return true;
    }

    public Account getAccount(String id) {
        for (Account a : this.accounts) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null;
    }

    public boolean addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
        return true;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
