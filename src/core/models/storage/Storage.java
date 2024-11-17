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
    
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }
    
    public boolean addUser(User user) {
        for (User u : this.users) {
            if (u.getId() == u.getId()) {
                return false;
            }
        }
        this.users.add(user);
        return true;
    }
    
    public Person getPerson(int id) {
        for (Person person : this.persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    
    public boolean delPerson(int id) {
        for (Person person : this.persons) {
            if (person.getId() == id) {
                this.persons.remove(person);
                return true;
            }
        }
        return false;
    }
}
