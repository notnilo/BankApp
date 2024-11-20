/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.person;

import core.models.Account;
import java.util.ArrayList;

/**
 *
 * @author notnilo
 */
public abstract class Person {

    protected int id;
    protected String firstname;
    protected String lastname;
    protected int age;
    protected ArrayList<Account> accounts;

    public Person(int id, String firstname, String lastname, int age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.accounts = new ArrayList<>();
    }
}
