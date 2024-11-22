/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author aleja
 */
public class AccountWithdraw {

    private Account account;

    public AccountWithdraw(Account account) {
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
