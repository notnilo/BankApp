/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author aleja
 */
public class AccountAdder {

    private User user;

    public AccountAdder(Account account) {
        this.user = user;
    }
    
    public void addAccount(Account account) {
        this.user.getAccounts().add(account);
    }

}
