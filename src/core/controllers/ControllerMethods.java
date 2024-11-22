/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author notnilo
 */
public interface ControllerMethods {
    
    public Response sort();
    public DefaultTableModel show(Response response);
}
