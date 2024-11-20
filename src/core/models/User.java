/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import core.person.Person;

/**
 *
 * @author edangulo
 */
public class User extends Person {
    
    public User(int id, String firstname, String lastname, int age) {
        super(id, firstname, lastname, age);
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
    
    public int getNumAccounts() {
        return this.accounts.size();
    }
    
    public void addAccount(Account account) {
        this.accounts.add(account);
    }
    
}
