
package gestionc;

import gui.inicio.MenuInicio;
import gui.inicio.Splash;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GestionC {

    
    public static void main(String[] args) {
        
        try {
            
            // Se crea una nueva instancia de la clase Splash.
            
            Splash.main(args);
            Process p = Runtime.getRuntime().exec("\"C:\\xampp\\xampp_start.exe\"");
            p.waitFor();
            Splash.cerrar();
 
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }            
 
            MenuInicio inicio = MenuInicio.getInstancia();
            inicio.setVisible(true);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(GestionC.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(GestionC.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
}
