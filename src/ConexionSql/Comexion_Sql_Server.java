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
public class Comexion_Sql_Server {
    Connection con = null;
    public Connection Conexion_sql_server(){
        String conexion = "jdbc:sqlserver://localhost:1433;"
                    + "database=proyectos; "
                    + "user = brayan_alexander_salazar_reyes; "
                    + "password = brayanreyes; "
                    + "loginTimeout = 30;";
        try {
            con = DriverManager.getConnection(conexion);
            JOptionPane.showMessageDialog(null, "conexion exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de conexion: " + e.getMessage());
        }
        return con;
    }
}
