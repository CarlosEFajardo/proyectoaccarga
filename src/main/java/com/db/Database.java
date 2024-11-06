/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Flia Castiblanco
 */
public class Database {
    
    //Declaro una Variable protegida de tipo "Connection" y le ponemos el nombre "conexion" 
    protected Connection conexion; //Como queremos usar el "Connection" del JAR de SQL, entonces el paquete o el JavaClass no puede llamarse "connection"
    
    private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    private final String DB_URL = "jdbc:mysql://localhost/ac_carga"; //localhost:Numero de Puerto de SQL /Nombre de la BD 
    
    private final String USER = "root";
    private final String PASS = "root2704";
    
    public void Conectar() throws ClassNotFoundException{
        try {
            conexion = DriverManager.getConnection(DB_URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void Cerrar() throws SQLException{
        
        if(conexion != null){               // Si la conexion no es Null
            if(!conexion.isClosed()){        //Validamos que la conexion no este cerrada
                conexion.close();                
            }
        }
        
    }
    
    
}
