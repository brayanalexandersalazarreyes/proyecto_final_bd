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
 * @author ASUS.
 */
public class conexion_Oracle {
    Connection con = null;
    
    public Connection conexionoracle(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe"
                    ,"brayan_alexander_salazar_reyes"
                    ,"brayanreyes");
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error de conexion: " + e.getMessage());
        }
        return con;
    }
    
}
