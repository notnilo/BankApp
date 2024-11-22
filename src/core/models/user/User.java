/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.user;

import core.models.user.handlers.UserAccountCounter;
import core.models.account.Account;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class User {

    private int id;
    private String firstname;
    private String lastname;
    private int age;
    private ArrayList<Account> accounts;
    private UserAccountCounter counter;

    public User(int id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.accounts = new ArrayList<>();
        this.counter = new UserAccountCounter(this);
    }

    public UserAccountCounter getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }
}
