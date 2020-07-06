/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siase_caja;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import siase_caja.models.ConexionBD;
import siase_caja.views.Home;

/**
 *
 * @author SOLUCIONES
 */
public class SIASE_Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Home home = new Home();
        home.setVisible(true);
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        try {
            ConexionBD.test();
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(SIASE_Caja.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
