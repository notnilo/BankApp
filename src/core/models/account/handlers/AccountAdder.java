/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.account.handlers;

import core.models.user.User;
import core.models.account.Account;

/**
 *
 * @author aleja
 */
public class AccountAdder {

    private User user;

    public AccountAdder(User user) {
        this.user = user;
    }

    public void addAccount(Account account) {
        this.user.getAccounts().add(account);
    }

}
