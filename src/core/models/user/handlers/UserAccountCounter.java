/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.user.handlers;

import core.models.user.User;

/**
 *
 * @author notnilo
 */
public class UserAccountCounter {
    
    private User user;

    public UserAccountCounter(User user) {
        this.user = user;
    }
    
    public int getNumAccounts() {
        return this.user.getAccounts().size();
    }
}
