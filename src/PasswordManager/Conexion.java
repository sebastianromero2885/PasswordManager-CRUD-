/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PasswordManager;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Sebastián
 */
public class Conexion {
    
     public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:db\\passwordmanager.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      return conn;
     }
    
     public static boolean ValidarRegistro(String nombre){
         boolean resultado = false;
         ArrayList<String> nombres = new ArrayList<>();
         String sql = "Select user from usuarios";
         
         try (Connection conn = Conexion.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            // loop through the result set
            while (rs.next()) {
                nombres.add(rs.getString("user"));
                
            }
                    
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
         
        for (int i = 0; i < nombres.size(); i++) {
            if(nombre.equals(nombres.get(i))){
               resultado = true;
            }
        }

        return resultado;
     
     }

    
 
    public static List VerificarUsuario(String nombre, String password){
            List<Object> datos = new ArrayList <Object>();
            boolean resultado = false;
            String name = "";
            String pass = "";

            String sql = "SELECT user, password FROM usuarios WHERE user= ? AND password= ?";

            try (Connection conn = Conexion.connect();
                 PreparedStatement pstmt  = conn.prepareStatement(sql)){

                // set the value
                pstmt.setString(1, nombre);
                pstmt.setString(2, password);
                //
                ResultSet rs  = pstmt.executeQuery();

                // loop through the result set
                while (rs.next()) {
                    name = (rs.getString("user"));
                    pass = (rs.getString("password"));

                }


            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

        if ("".equals(name)) {
           resultado = true;  
        }
        datos.add(resultado);
        datos.add(name);


        return datos;
        }
     
   
     

    public static void Registrar(String nombre, String password){
       String sql = "INSERT INTO usuarios (user,password) VALUES(?,?)";

       try (Connection conn = Conexion.connect();
           PreparedStatement pstmt = conn.prepareStatement(sql)) {
           pstmt.setString(1, nombre);
           pstmt.setString(2, password);
           pstmt.executeUpdate();
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }


    }

    public static void IngresarRegistro(String sitio, String user, String password){
        String cuenta = Login.cuenta;
        
        String sql = "insert into informacion (user,sitio,password,usuario) VALUES (?,?,?,?)";

        try (Connection conn = Conexion.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, cuenta);
            pstmt.setString(2, sitio.toUpperCase());
            pstmt.setString(3, user);
            pstmt.setString(4, password);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

}
    
    public static void ModificarRegistro(int id, String sitio, String cuenta, String password){
       String sql = "UPDATE informacion SET sitio= ? , usuario= ? , password= ? WHERE ID= ?";

       try (Connection conn = Conexion.connect();
           PreparedStatement pstmt = conn.prepareStatement(sql)) {
           pstmt.setString(1, sitio.toUpperCase());
           pstmt.setString(2, cuenta);
           pstmt.setString(3, password);
           pstmt.setInt(4, id);
           pstmt.executeUpdate();
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }


    }
    
    
    
    
    
    
    
     
  public static void EliminarFila(Object item){
        String sql = "DELETE FROM informacion WHERE ID = ? ";
        try (Connection conn = Conexion.connect();
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, (int)item);
            
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
  
    }
    
     
     
     
     
     
     
    
}
