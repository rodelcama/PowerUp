/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.ResultSet;
import java.sql.Statement;

import Beans.Cliente;
import Connection.DBConnection;
import com.google.gson.Gson;

public class ClienteController implements IClienteController{
    
    @Override
    public String login(String identificacion, String password){
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        String sql = "SELECT * FROM clientes WHERE identificacion = '" +  identificacion + "' and password = '" + password + "'";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String nombre = rs.getString("nombres");
                String apellido = rs.getString("apellidos");
                String email = rs.getString("email");
                boolean nuevo = rs.getBoolean("nuevo");
                int numero = rs.getInt("numeroTC");
                Cliente usuario = new Cliente (identificacion, password, nombre, apellido, email, nuevo, numero);
                return gson.toJson(usuario);
            }
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally{
            con.desconectar();
        }
        
        return "false";
    }
    
    @Override
    public String register(String identificacion, String password, String nombres, String apellidos, String email, boolean nuevo, int numeroTC) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Insert into clientes values('" + identificacion + "', '" + password + "', '" + nombres
                + "', '" + apellidos + "', '" + email + "', " + nuevo + ", " + numeroTC + "  )";

        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);

            Cliente usuario = new Cliente(identificacion, password, nombres, apellidos, email, nuevo, numeroTC);

            st.close();

            return gson.toJson(usuario);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            con.desconectar();
        }

        return "false";

    }
    @Override
    public String pedir(String identificacion) {
        
        Gson gson = new Gson();
        DBConnection con = new DBConnection();
        
        String sql = "SELECT * FROM clientes WHERE identificacion = '" +  identificacion + "'";
        
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                String password = rs.getString("password");
                String nombre = rs.getString("nombres");
                String apellido = rs.getString("apellidos");
                String email = rs.getString("email");
                boolean nuevo = rs.getBoolean("nuevo");
                int numero = rs.getInt("numeroTC");
                Cliente usuario = new Cliente (identificacion, password, nombre, apellido, email, nuevo, numero);
                return gson.toJson(usuario);
                
              
            }
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }finally{
            con.desconectar();
        }
        
        return "false";
        
        
    }

    

   
}

    
    



