package centralc;


public class CRUD extends javax.swing.JFrame {

 
    public CRUD() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("GestionC. Menú.");   
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonUsuarios = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonAutobuses = new javax.swing.JButton();
        jButtonChoferes = new javax.swing.JButton();
        jButtonRutas = new javax.swing.JButton();
        jButtonSalidas = new javax.swing.JButton();
        jButtonGraficas = new javax.swing.JButton();
        jButtonMasRegistros = new javax.swing.JButton();
        jButtonChoferes1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(146, 219, 219));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Menú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/administradores.png"))); // NOI18N
        jButtonUsuarios.setToolTipText("Usuarios.");
        jButtonUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonUsuarios.setMaximumSize(new java.awt.Dimension(128, 128));
        jButtonUsuarios.setMinimumSize(new java.awt.Dimension(128, 128));
        jButtonUsuarios.setName(""); // NOI18N
        jButtonUsuarios.setPreferredSize(new java.awt.Dimension(128, 128));
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });

        jButtonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clientes.png"))); // NOI18N
        jButtonClientes.setToolTipText("Clientes.");
        jButtonClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonClientes.setMaximumSize(new java.awt.Dimension(128, 128));
        jButtonClientes.setMinimumSize(new java.awt.Dimension(128, 128));
        jButtonClientes.setPreferredSize(new java.awt.Dimension(128, 128));
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        jButtonAutobuses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/autobuses.png"))); // NOI18N
        jButtonAutobuses.setToolTipText("Autobuses.");
        jButtonAutobuses.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonAutobuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAutobusesActionPerformed(evt);
            }
        });

        jButtonChoferes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/choferes.png"))); // NOI18N
        jButtonChoferes.setToolTipText("Choferes.");
        jButtonChoferes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonChoferes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChoferesActionPerformed(evt);
            }
        });

        jButtonRutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rutas.png"))); // NOI18N
        jButtonRutas.setToolTipText("Rutas.");
        jButtonRutas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRutasActionPerformed(evt);
            }
        });

        jButtonSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salidas.png"))); // NOI18N
        jButtonSalidas.setToolTipText("Salidas.");
        jButtonSalidas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalidasActionPerformed(evt);
            }
        });

        jButtonGraficas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/graficas.png"))); // NOI18N
        jButtonGraficas.setToolTipText("Gráficos.");
        jButtonGraficas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficasActionPerformed(evt);
            }
        });

        jButtonMasRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas.png"))); // NOI18N
        jButtonMasRegistros.setToolTipText("Más.");
        jButtonMasRegistros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jButtonChoferes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Tickets.png"))); // NOI18N
        jButtonChoferes1.setToolTipText("Boletos.");
        jButtonChoferes1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonChoferes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChoferes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChoferes1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonAutobuses, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonChoferes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonMasRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAutobuses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jButtonChoferes1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonChoferes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalidas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGraficas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMasRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRutas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed

        Usuarios a = new Usuarios();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed

        Clientes a = new Clientes();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonAutobusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAutobusesActionPerformed

        Autobuses a = new Autobuses();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAutobusesActionPerformed

    private void jButtonChoferesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChoferesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChoferesActionPerformed

    private void jButtonRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRutasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRutasActionPerformed

    private void jButtonSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalidasActionPerformed

    private void jButtonGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGraficasActionPerformed

    private void jButtonChoferes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChoferes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChoferes1ActionPerformed

    
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAutobuses;
    private javax.swing.JButton jButtonChoferes;
    private javax.swing.JButton jButtonChoferes1;
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonGraficas;
    private javax.swing.JButton jButtonMasRegistros;
    private javax.swing.JButton jButtonRutas;
    private javax.swing.JButton jButtonSalidas;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
