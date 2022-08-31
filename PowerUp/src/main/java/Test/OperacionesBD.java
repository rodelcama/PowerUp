package Test;

import Beans.PowerBank;
import Connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {
    
    public static void main(String[] args) {
        
        //listarPowerBank();
        actualizarPowerBank(1, "Xiaomi");
    }
    
    public static void actualizarPowerBank(int id, String marca){
        
        DBConnection con = new DBConnection();
        String sql = "UPDATE powerbanks SET marca = '" + marca + "' WHERE idPowerBank = " + id;
        
        try {
            
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            
        } finally {
            
            con.desconectar();
        }
        
    }
    
    
    public static void listarPowerBank(){
        
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM powerbanks";
        
        try {
            
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                
                int idPowerBank = rs.getInt("idPowerBank");
                String capacidad = rs.getString("capacidad");
                String marca = rs.getString("marca");
                boolean cargado = rs.getBoolean("cargado");
                
                PowerBank powerBank = new PowerBank(idPowerBank, capacidad, marca, cargado);
                System.out.println(powerBank.toString());
                                                      
            }
            
            st.executeQuery(sql);
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        } finally {
            
            con.desconectar();
        }
        
    }
}
