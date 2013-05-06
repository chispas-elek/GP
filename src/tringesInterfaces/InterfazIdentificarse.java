
package tringesInterfaces;

import java.awt.Dimension;
import java.awt.Point;
import java.util.Locale;

/**
 *
 * @author Aaron
 */
public class InterfazIdentificarse extends javax.swing.JFrame {

    
    
    
    public InterfazIdentificarse() {
        
        
       
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bClasificacion = new javax.swing.JButton();
        tUsuario = new javax.swing.JTextField();
        tPassword = new javax.swing.JTextField();
        bAceptar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bConexion = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("tringesInterfaces/Idioma"); // NOI18N
        setTitle(bundle.getString("TRINGES -IDENTIFICACION-")); // NOI18N

        jLabel1.setText(bundle.getString("USUARIO")); // NOI18N

        jLabel2.setText(bundle.getString("CONTRASEÑA")); // NOI18N

        bClasificacion.setText(bundle.getString("VER CLASIFICACION")); // NOI18N
        bClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClasificacionActionPerformed(evt);
            }
        });

        bAceptar.setText(bundle.getString("ACEPTAR")); // NOI18N
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        bCancelar.setText(bundle.getString("CANCELAR")); // NOI18N
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bConexion.setText(bundle.getString("CONEXION BD")); // NOI18N
        bConexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConexionActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Castellano", "Euskera" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bAceptar)
                .addGap(18, 18, 18)
                .addComponent(bCancelar)
                .addGap(8, 8, 8))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tUsuario)
                            .addComponent(tPassword)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bClasificacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(bConexion))
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClasificacion)
                    .addComponent(bConexion))
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAceptar)
                    .addComponent(bCancelar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
                    
    private void bClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClasificacionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new InterfazVerClasificacion().setVisible(true);
    }//GEN-LAST:event_bClasificacionActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
       /* String user = this.tUsuario.getText();
        boolean existe = false; //Comprueba que el usuario exista
        if(!existe) {
            this.dispose();
            new InterfazBannerErrorLogin().setVisible(true);
        }
        String pass = this.tPassword.getText();
        String authen = null;//password del usuario user extraido de la base de datos
        if(pass.equals(authen)) { //Falta la gestion con la base de datos
            
            this.dispose();
    
            new InterfazBannerErrorLogin().setVisible(true);
        }*/
        this.dispose();
        new InterfazUsuarioAdministrador().setVisible(true);
    }//GEN-LAST:event_bAceptarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:t
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bConexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConexionActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new InterfazDatosBD().setVisible(true);
    }//GEN-LAST:event_bConexionActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        if(jComboBox1.getSelectedIndex()==0){
            
        Locale.setDefault(Locale.forLanguageTag("es-ES"));
        final Point p = getLocation();
        final Dimension d = getSize();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazIdentificarse f = new InterfazIdentificarse();
                f.setLocation(p);
                f.setSize(d);
                f.setVisible(true);
            }
        });
        dispose();
        
        }
        else{
            
            Locale.setDefault(Locale.forLanguageTag("eu-ES"));
        final Point p = getLocation();
        final Dimension d = getSize();
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                InterfazIdentificarse f = new InterfazIdentificarse();
                f.setLocation(p);
                f.setSize(d);
                f.setVisible(true);
            }
        });
        dispose();
            
        }
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bClasificacion;
    private javax.swing.JButton bConexion;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tPassword;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}
