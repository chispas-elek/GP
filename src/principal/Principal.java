/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import tringesInterfaces.InterfazIdentificarse;
import tringesControlador.UnionBD;

/**
 *
 * @author Aaron
 */
public class Principal {
    
    
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazIdentificarse().setVisible(true);
            }
        });
        
        //Creación de una instancia de UnionBD
        
        UnionBD unionADB = new UnionBD();
        
 
    }    
    
}
