/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author aleja
 */
public class AccountDeposit {

    private Account account;

    public AccountDeposit(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        this.account.setBalance (this.account.getBalance()+ amount) ;
    }
    
}
