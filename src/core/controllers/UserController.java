/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.User;
import core.models.storage.Storage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author notnilo
 */
public class UserController {
    
    public static Response createUser(String id, String firstname, String lastname, String age) {
        try {
            int idInt, ageInt;
            try {
                idInt = Integer.parseInt(id);
                if (idInt < 0) {
                    return new Response("Id must be positive", Status.BAD_REQUEST);
                }
                if (id.length() < 9) {
                    return new Response("Id must have at least 9 digits", Status.BAD_REQUEST);
                }
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            if (firstname.equals("")) {
                return new Response("First name must be not empty", Status.BAD_REQUEST);
            }
            if (lastname.equals("")) {
                return new Response("Last name must be not empty", Status.BAD_REQUEST);
            }
            try {
                ageInt = Integer.parseInt(age);
                if (ageInt < 0) {
                    return new Response("Age must be positive", Status.BAD_REQUEST);
                }
                if (ageInt <= 18) {
                    return new Response("Age must be over 18", Status.BAD_REQUEST);
                }
            } catch (NumberFormatException ex) {
                return new Response("Age must be numeric", Status.BAD_REQUEST);
            }
            Storage storage = Storage.getInstance();
            if (!storage.addUser(new User(idInt, firstname, lastname, ageInt))) {
                return new Response("A person with that id already exists", Status.BAD_REQUEST);
            }
            return new Response("Person created successfully", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static Response sortUser() {
        try {
            Storage storage = Storage.getInstance();
            storage.getUsers().sort((obj1, obj2) -> (obj1.getId() - obj2.getId()));
            return new Response("Successful operation", Status.OK, storage.getUsers());
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }

    public static DefaultTableModel showUsers(Response response) {
        String[] columnNames = {"ID", "Full Name", "Age", "Number of Accounts"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        for (User user : (List<User>) response.getObject()) {
            Object[] row = {
                user.getId(),
                user.getFirstname() + " " + user.getLastname(),
                user.getAge(),
                user.getNumAccounts()
            };
            model.addRow(row);
        }
        return model;
    }
}
