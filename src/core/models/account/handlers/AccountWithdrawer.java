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
public class AccountWithdrawer {

    private Account account;

    public AccountWithdrawer(Account account) {
        this.account = account;
    }

    public boolean withdraw(double amount) {
        if (amount > this.account.getBalance()) {
            return false;
        }
        this.account.setBalance(this.account.getBalance() - amount);
        return true;
    }
}
