/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.account;

import core.models.account.handlers.AccountAdder;
import core.models.account.handlers.AccountDepositer;
import core.models.account.handlers.AccountWithdrawer;
import core.models.user.User;

/**
 *
 * @author edangulo
 */
public class Account {
    
    private String id;
    private User owner;
    private double balance;
    private AccountAdder adder;
    private AccountDepositer depositer;
    private AccountWithdrawer withdrawer;
    

    public Account(String id, User owner) {
        this.id = id;
        this.owner = owner;
        this.balance = 0;
        this.adder = new AccountAdder(owner);
        this.depositer = new AccountDepositer(this);
        this.withdrawer = new AccountWithdrawer(this);
        adder.addAccount(this);
    }
    
    public Account(String id, User owner, double balance) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.adder = new AccountAdder(owner);
        this.depositer = new AccountDepositer(this);
        this.withdrawer = new AccountWithdrawer(this);
        adder.addAccount(this);
    }
    
    public String getId() {
        return id;
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public AccountAdder getAdder() {
        return adder;
    }

    public AccountDepositer getDepositer() {
        return depositer;
    }

    public AccountWithdrawer getWithdrawer() {
        return withdrawer;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
