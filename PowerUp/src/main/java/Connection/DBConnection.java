package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    Connection connection;
    static String bd = "powerup";
    static String port = "3307";
    static String login = "root";
    static String password = "admin";
    
    public DBConnection(){
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Juaaaaa... Conexion Exitosa... Bienvenido");
                   
        } catch (Exception ex) {
            
            System.out.println("Naaaaa, Error en la conexion... Revise el error" + ex);
            
        }
        
    }
    
    public Connection getConnection(){
        
        return connection;
    }
    
    public void desconectar(){
        
        connection = null;
    }
    
}
