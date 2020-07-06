/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package siase_caja.models;

import java.sql.*;
import java.util.Properties;
/**
 *
 * @author SOLUCIONES
 */
public class ConexionBD {
    
    
    public static Connection conexion() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/caja_Test";
        Properties conectionData = new Properties();
        conectionData.setProperty("user","postgres");
        conectionData.setProperty("password","postgres");
        //conectionData.setProperty("ssl","true");
        Connection conn = DriverManager.getConnection(url, conectionData);
        return conn;
    }
    
    public static void test() throws SQLException{
        Connection conn = conexion();
        conn.setAutoCommit(false);
        // Turn use of the cursor on.
        try (Statement st = conn.createStatement()) {
            // Turn use of the cursor on.
   
            try (ResultSet rs = st.executeQuery("SELECT * FROM public.\"Servicio\"")) {
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "||" + rs.getString(2) + "||" + rs.getString(3)  );
                    
                }
                // Close the statement.
            }
        }
    }
}
