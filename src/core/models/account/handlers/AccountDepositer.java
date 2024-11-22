/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.account.handlers;

import core.models.account.Account;

/**
 *
 * @author aleja
 */
public class AccountDepositer {

    private Account account;

    public AccountDepositer(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        this.account.setBalance (this.account.getBalance()+ amount) ;
    }
    
}
