/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Conexion_postgresql {
    Connection con = null;
    
    public Connection Conexion_postgresql(){
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/proyectos"
                    ,"brayan_alexander_salazar_reyes"
                    ,"brayanreyes");
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e.getMessage());
        }
        return con;
    }
}
