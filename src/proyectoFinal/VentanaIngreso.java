//
package proyectoFinal;
//
import java.io.*;
import javax.swing.JOptionPane;
//
public class VentanaIngreso extends javax.swing.JFrame {
    private static long cuentaIngresada;
    
    public VentanaIngreso() {
        initComponents();
    }
    
    public static long getCuentaIngresada() {
        return cuentaIngresada;
    }

    public static void setCuentaIngresada(long cuentaIngresada) {
        VentanaIngreso.cuentaIngresada = cuentaIngresada;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTFIngresoUsuario = new javax.swing.JTextField();
        jTFIngresoContrasena = new javax.swing.JPasswordField();
        jPUsuario = new javax.swing.JPanel();
        jLIngreseUsuario = new javax.swing.JLabel();
        jPPin = new javax.swing.JPanel();
        jLIngresePin = new javax.swing.JLabel();
        jBContinuar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBRegistrarUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero Automático");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jTFIngresoUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTFIngresoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIngresoUsuarioActionPerformed(evt);
            }
        });

        jTFIngresoContrasena.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPUsuario.setBackground(new java.awt.Color(0, 153, 255));

        jLIngreseUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLIngreseUsuario.setText("Ingrese usuario:");

        javax.swing.GroupLayout jPUsuarioLayout = new javax.swing.GroupLayout(jPUsuario);
        jPUsuario.setLayout(jPUsuarioLayout);
        jPUsuarioLayout.setHorizontalGroup(
            jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPUsuarioLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLIngreseUsuario)
                .addGap(34, 34, 34))
        );
        jPUsuarioLayout.setVerticalGroup(
            jPUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIngreseUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPPin.setBackground(new java.awt.Color(0, 153, 255));

        jLIngresePin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLIngresePin.setText("Ingrese Pin:");

        javax.swing.GroupLayout jPPinLayout = new javax.swing.GroupLayout(jPPin);
        jPPin.setLayout(jPPinLayout);
        jPPinLayout.setHorizontalGroup(
            jPPinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPinLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLIngresePin)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPPinLayout.setVerticalGroup(
            jPPinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLIngresePin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jBContinuar.setBackground(new java.awt.Color(0, 204, 0));
        jBContinuar.setText("Continuar");
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jBCancelar.setBackground(new java.awt.Color(255, 0, 51));
        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jBRegistrarUsuarios.setText("Registrar Usuario");
        jBRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(660, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBContinuar, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jBRegistrarUsuarios))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFIngresoContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(jTFIngresoUsuario))))
                        .addGap(0, 203, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCancelar, jBContinuar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBRegistrarUsuarios)
                .addGap(80, 80, 80)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFIngresoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFIngresoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBCancelar, jBContinuar});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTFIngresoContrasena, jTFIngresoUsuario});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed
        // TODO add your handling code here:
        String usuario, sPin;
        usuario = jTFIngresoUsuario.getText();
        usuario = usuario.replace(" ", "");
        sPin = String.valueOf(jTFIngresoContrasena.getPassword());

        if (usuario.equals("") || sPin.equals("")) {
            JOptionPane.showMessageDialog(null, "Recuerde llenar ambos campos.");
        } else {
            if (usuario.length() == 16) {
                if (sPin.length() == 4) {
                    boolean camposSoloDigitos;
                    try {
                        Long.parseLong(usuario);
                        Integer.parseInt(sPin);
                        //System.out.println("Los Pins ingresados son números"); //(Temporal)
                        camposSoloDigitos = true;
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Solo se permiten digitos.");
                        jTFIngresoUsuario.setText("");
                        jTFIngresoContrasena.setText("");
                        camposSoloDigitos = false;
                    }
                    if (camposSoloDigitos) {
                        boolean cuentaExistencia, contrasenaEstado;
                        long cuenta;
                        int nip;
                        cuenta = Long.parseLong(usuario);//CACHAR ERROR (Temporal)
                        nip = Integer.parseInt(sPin);//CACHAR ERROR (Temporal)

                        cuentasAccionesPrincipales cuentasAP = new cuentasAccionesPrincipales();
                        try {
                            cuentaExistencia = cuentasAP.buscarCuentasMostrarMensaje(cuenta);
                            if (cuentaExistencia) {
                                contrasenaEstado = cuentasAP.ingresoCuenta(cuenta, nip);
                                if (contrasenaEstado) {
                                    jTFIngresoUsuario.setText("");
                                    jTFIngresoContrasena.setText("");
                                    setCuentaIngresada(cuenta);
                                    VentanaMenu ventanaMenu = new VentanaMenu();
                                    ventanaMenu.setVisible(true);
                                    this.dispose();
                                } else {
                                    jTFIngresoContrasena.setText("");
                                }
                            } else {
                                jTFIngresoUsuario.setText("");
                                jTFIngresoContrasena.setText("");
                            }
                        } catch (IOException ex) {
                            System.out.println("Error: " + ex);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Recuerde que su contraseña esta constituida únicamente por 4 dígitos.");
                    jTFIngresoContrasena.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Recuerde que su usuario esta constituido únicamente por 16 dígitos.");
                jTFIngresoUsuario.setText("");
                jTFIngresoContrasena.setText("");
            }
        }
        //System.out.println("FIN DEL BOTON CONTINUAR");//(Temporal)
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jTFIngresoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIngresoUsuarioActionPerformed
        // TODO add your handling code here:
        //COLOCAR ESPACIOS AUTOMATICAMENTE CADA 4 NUMEROS
        //String longitud;
        //longitud = jTFIngresoUsuario.getText();
        //System.out.println("longitud = " + longitud.length());
    }//GEN-LAST:event_jTFIngresoUsuarioActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        jTFIngresoUsuario.setText("");
        jTFIngresoContrasena.setText("");
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarUsuariosActionPerformed
        // TODO add your handling code here:
        VentanaRegistroUsuarios ventanaRegistroUsuarios = new VentanaRegistroUsuarios();
        ventanaRegistroUsuarios.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRegistrarUsuariosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIngreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBRegistrarUsuarios;
    private javax.swing.JLabel jLIngresePin;
    private javax.swing.JLabel jLIngreseUsuario;
    private javax.swing.JPanel jPPin;
    private javax.swing.JPanel jPUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTFIngresoContrasena;
    private javax.swing.JTextField jTFIngresoUsuario;
    // End of variables declaration//GEN-END:variables
}
