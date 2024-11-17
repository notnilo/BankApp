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
    private ArrayList<User> users;
    private ArrayList<Account> accounts;
    private ArrayList<Transaction> transactions;
    
    private Storage() {
        this.users = new ArrayList<>();
        this.accounts = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }
}
