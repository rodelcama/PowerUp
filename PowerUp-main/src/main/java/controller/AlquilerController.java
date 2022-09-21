/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import java.sql.ResultSet;
import java.sql.Statement;
import Beans.PowerBank;
import Connection.DBConnection;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class AlquilerController implements IAlquilerController {

    @Override
    public String listar(boolean ordenar, String orden) {

        Gson gson = new Gson();

        DBConnection con = new DBConnection();
        String sql = "Select * from powerbanks LIMIT 100";

        if (ordenar == true) {
            sql += " order by marca " + orden;
        }

        List<String> peliculas = new ArrayList<String>();

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                int idPowerBank = rs.getInt("idPowerBank");
                String capacidad = rs.getString("capacidad");
                String marca = rs.getString("marca");
                boolean cargado = rs.getBoolean("cargado");

                PowerBank pelicula = new PowerBank(idPowerBank, capacidad, marca, cargado);

                peliculas.add(gson.toJson(pelicula));

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

        return gson.toJson(peliculas);

    }
    
    
    
}
