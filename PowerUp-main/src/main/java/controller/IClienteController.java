/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.Statement;

import Beans.Cliente;
import Connection.DBConnection;
import com.google.gson.Gson;

/**
 *
 * @author pao14
 */
public interface IClienteController {
    public String login(String identificacion, String password);
    
    public String register(String identificacion, String password, String nombres, 
            String apellidos, String email, boolean nuevo, int numeroTC); 
    public String pedir(String username) ;

}
