//
package proyectoFinal;
//
import java.io.*;
import javax.swing.JOptionPane;
//
public class VentanaCambioNip extends javax.swing.JFrame {

    public VentanaCambioNip() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTFPinActual = new javax.swing.JPasswordField();
        jTFPinNuevo = new javax.swing.JPasswordField();
        jTFPinConfirmar = new javax.swing.JPasswordField();
        jPPinActual = new javax.swing.JPanel();
        jLPinActual = new javax.swing.JLabel();
        jPPinNuevo = new javax.swing.JPanel();
        jLPinNuevo = new javax.swing.JLabel();
        jPPinConfirmar = new javax.swing.JPanel();
        jLPinConfirmar = new javax.swing.JLabel();
        jBContinuar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cajero Automático");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, null));

        jTFPinActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTFPinNuevo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jTFPinConfirmar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jPPinActual.setBackground(new java.awt.Color(0, 153, 255));

        jLPinActual.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLPinActual.setText("Ingrese Nip actual:");

        javax.swing.GroupLayout jPPinActualLayout = new javax.swing.GroupLayout(jPPinActual);
        jPPinActual.setLayout(jPPinActualLayout);
        jPPinActualLayout.setHorizontalGroup(
            jPPinActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPinActualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLPinActual)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPPinActualLayout.setVerticalGroup(
            jPPinActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPinActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPPinNuevo.setBackground(new java.awt.Color(0, 153, 255));

        jLPinNuevo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLPinNuevo.setText("Ingrese nuevo Nip:");

        javax.swing.GroupLayout jPPinNuevoLayout = new javax.swing.GroupLayout(jPPinNuevo);
        jPPinNuevo.setLayout(jPPinNuevoLayout);
        jPPinNuevoLayout.setHorizontalGroup(
            jPPinNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPinNuevoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLPinNuevo)
                .addGap(26, 26, 26))
        );
        jPPinNuevoLayout.setVerticalGroup(
            jPPinNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPinNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPPinConfirmar.setBackground(new java.awt.Color(0, 153, 255));

        jLPinConfirmar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLPinConfirmar.setText("Confirmar Nip:");

        javax.swing.GroupLayout jPPinConfirmarLayout = new javax.swing.GroupLayout(jPPinConfirmar);
        jPPinConfirmar.setLayout(jPPinConfirmarLayout);
        jPPinConfirmarLayout.setHorizontalGroup(
            jPPinConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPinConfirmarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLPinConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPinConfirmarLayout.setVerticalGroup(
            jPPinConfirmarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLPinConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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

        jBRegresar.setBackground(new java.awt.Color(255, 191, 0));
        jBRegresar.setText("Regresar");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPPinConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPPinNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(jPPinActual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTFPinActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(304, 304, 304))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPinNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTFPinConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBContinuar, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBRegresar)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBCancelar, jBContinuar, jBRegresar});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTFPinActual, jTFPinConfirmar, jTFPinNuevo});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPPinActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPinActual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFPinNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPPinNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFPinConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPPinConfirmar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBCancelar, jBContinuar, jBRegresar});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPPinActual, jTFPinActual, jTFPinConfirmar, jTFPinNuevo});

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
        String pin1,pin2,pin3;
        boolean pinsBoolean;
        pin1 = String.valueOf(jTFPinActual.getPassword());
        pin2 = String.valueOf(jTFPinNuevo.getPassword());
        pin3 = String.valueOf(jTFPinConfirmar.getPassword());
        
        if (pin1.equals("")||pin2.equals("")||pin3.equals("")) {
            JOptionPane.showMessageDialog(null, "Recuerde llenar todos los campos.");
        }else{            
            if (pin1.length()==4 && pin2.length()==4 && pin3.length()==4) {
                try {
                    Integer.parseInt(pin1);
                    Integer.parseInt(pin2);
                    Integer.parseInt(pin3);
                    //System.out.println("Los Pins ingresados son números"); //(Temporal)
                    pinsBoolean = true;
                } catch (NumberFormatException ex) {
                    //System.out.println("NO es un numero"); //(Temporal)
                    pinsBoolean = false;
                }
                if (!pinsBoolean) {
                    JOptionPane.showMessageDialog(null, "Recuerde que el PIN esta compuesto por 4 dígitos (números) únicamente.");
                    jTFPinActual.setText("");
                    jTFPinNuevo.setText("");
                    jTFPinConfirmar.setText("");
                }else{
                    int pin11,pin22,pin33;
                    pin11 = Integer.parseInt(pin1);
                    pin22 = Integer.parseInt(pin2);
                    pin33 = Integer.parseInt(pin3);
                    
                    long cuentaIngresada;
                    cuentaIngresada = VentanaIngreso.getCuentaIngresada();
                    cuentasAccionesPrincipales cuentasAP = new cuentasAccionesPrincipales();
                    
                    try {
                        if (cuentasAP.comprobarPinCambioNip(cuentaIngresada, pin11)) {
                            if (pin22 != pin33) {
                                JOptionPane.showMessageDialog(null, "El campo 2 no coicide con el campo 3.");
                                jTFPinNuevo.setText("");
                                jTFPinConfirmar.setText("");
                            } else {
                                cuentasAP.cambioNip(cuentaIngresada, pin22);
                                JOptionPane.showMessageDialog(null, "Cambio de Nip Exitoso.");
                                jTFPinActual.setText("");
                                jTFPinNuevo.setText("");
                                jTFPinConfirmar.setText("");
                            }
                        }else{
                            jTFPinActual.setText("");
                        }
                    } catch (IOException ex) {
                        System.out.println("Error: " + ex);
                    }
                }                
            }else {
                JOptionPane.showMessageDialog(null, "Recuerde que el PIN esta compuesto por 4 dígitos.");
                jTFPinActual.setText("");
                jTFPinNuevo.setText("");
                jTFPinConfirmar.setText("");
            }
        }
        //System.out.println("FIN DEL BOTON CONTINUAR");//(Temporal)
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        // TODO add your handling code here:
        jTFPinActual.setText("");
        jTFPinNuevo.setText("");
        jTFPinConfirmar.setText("");
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        // TODO add your handling code here:
        VentanaMenu ventanaMenu = new VentanaMenu();
        ventanaMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCambioNip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCambioNip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCambioNip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCambioNip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCambioNip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLPinActual;
    private javax.swing.JLabel jLPinConfirmar;
    private javax.swing.JLabel jLPinNuevo;
    private javax.swing.JPanel jPPinActual;
    private javax.swing.JPanel jPPinConfirmar;
    private javax.swing.JPanel jPPinNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jTFPinActual;
    private javax.swing.JPasswordField jTFPinConfirmar;
    private javax.swing.JPasswordField jTFPinNuevo;
    // End of variables declaration//GEN-END:variables
}
