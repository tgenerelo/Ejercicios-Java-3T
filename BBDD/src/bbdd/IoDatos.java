/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;


import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




/**
 *
 * @author profesor
 */
public class IoDatos {

   
    
    public static void conectarBBDD(){
       
        
     
        String url = "jdbc:mysql://localhost:3306/programacion";
        String user = "usuario";
        String pass = "usuario";
         
        try (Connection con =  DriverManager.getConnection(url, user, pass);){

           
            Statement s =  con.createStatement();
            ResultSet sol = s.executeQuery("SELECT * FROM alumno;");
            
            while (sol.next()){
                System.out.println(sol.getString(1) + " -- " + 
                        sol.getInt(2));
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace() ;
            
        } 
        
    }
    
}
