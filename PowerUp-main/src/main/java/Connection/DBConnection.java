package Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    
    Connection connection;
    static String bd = "Powerup";
    static String port = "3306";
    static String login = "root";
    static String password = "ADMIN";
    
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
