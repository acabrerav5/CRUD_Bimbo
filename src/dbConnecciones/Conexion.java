package dbConnecciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author angel
 */

public class Conexion {

    Connection con;
    
    public Conexion(){    
   
            try {   
               Class.forName("com.mysql.jdbc.Driver");
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_umg","root","");
               System.out.println("Conexion Establecida...");
               
                    }catch(ClassNotFoundException | SQLException e){
                    System.out.println(e.getMessage()); 
                
        }
    }
    public Connection getConnection(){
        
    return (Connection) con; 
    }
}