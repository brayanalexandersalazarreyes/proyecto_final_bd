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
public class conexion_MYSQL {
    Connection conectar = null;
    
    public Connection conexionMysql(){
        String nombre = "brayan_alexander_salazar_reyes", password = "brayanreyes";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/proyectos", nombre,password);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error en conexion: " + e.getMessage());
        }
        return conectar;
    }
}
