package centralc;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {

    private static InicioSesion instancia = null;
    private static int intentos;
    
   

    public InicioSesion() {

        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("CentralC.");
        this.setResizable(false);
        OperacionesBD.levantarServidorXampp();
        intentos = 0;
    }

    public static InicioSesion getInstancia() {
        
        synchronized (InicioSesion.class) {
            if (instancia == null) {
                instancia = new InicioSesion();
            }
        }
        return instancia;
    }
    
     private void ingresar() {
        
        String usuario = jTextFieldUsuario.getText();
        String contraseña = String.valueOf(jPasswordContraseña.getPassword());
        String info[] = OperacionesBD.buscarUsuario(usuario);
        
        if (info != null){
        
        if (info[0].equals(usuario)) {
            
            if (info[1].equals(contraseña)) {
                
                JOptionPane.showMessageDialog(null, "Sistema: Bienvenido " + usuario, "AgendITA: Login", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                MenuPrincipal menu = MenuPrincipal.getInstancia();
                menu.setVisible(true);

            } else {
                
                intentos++;
                
                if (intentos == 3) {
                    
                    JOptionPane.showMessageDialog(null, "Número máximo de intentos excedido", "AgendITA: Login", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                }
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "AgendITA: Login", JOptionPane.ERROR_MESSAGE);
                borrarFormulario();
            }

        } else {
            intentos++;
            
            if (intentos == 3) {
                JOptionPane.showMessageDialog(null, "Número máximo de intentos excedido", "AgendITA: Login", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            JOptionPane.showMessageDialog(null, "Usuario No escontrado", "AgendITA: Login", JOptionPane.ERROR_MESSAGE);
            borrarFormulario();   
            }    
            
            } else {

                intentos++;
                
                if (intentos == 3) {
                    JOptionPane.showMessageDialog(null, "Número máximo de intentos excedido", "AgendITA: Login", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                }
                JOptionPane.showMessageDialog(null, "Usuario No encontrado", "AgendITA: Login", JOptionPane.ERROR_MESSAGE);
                borrarFormulario();
            }
        }
    
    private void borrarFormulario() {
        
        jTextFieldUsuario.setText("");
        jPasswordContraseña.setText("");
        jTextFieldUsuario.requestFocus();
    }
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPasswordContraseña = new javax.swing.JPasswordField();
        jButtonIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(146, 219, 219));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMousePressed(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });

        jButtonAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAtras.setText("Atrás");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/llave.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setMinimumSize(new java.awt.Dimension(32, 3));

        jPasswordContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPasswordContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPasswordContraseñaMouseExited(evt);
            }
        });
        jPasswordContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordContraseñaActionPerformed(evt);
            }
        });
        jPasswordContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordContraseñaKeyTyped(evt);
            }
        });

        jButtonIniciarSesion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonIniciarSesion.setText("Aceptar");
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAtras)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonIniciarSesion)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAtras)
                    .addComponent(jButtonIniciarSesion))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes\\logoPestaña.png"));
        return retValue;
    }
   
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButtonAtrasActionPerformed
   
    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordContraseñaActionPerformed

    }//GEN-LAST:event_jPasswordContraseñaActionPerformed

    private void jTextFieldUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMousePressed
     
     
    }//GEN-LAST:event_jTextFieldUsuarioMousePressed

    private void jTextFieldUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseEntered
        jTextFieldUsuario.setBackground(Color.LIGHT_GRAY);
      
    }//GEN-LAST:event_jTextFieldUsuarioMouseEntered

    private void jTextFieldUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseExited
        jTextFieldUsuario.setBackground(Color.WHITE);
        
    }//GEN-LAST:event_jTextFieldUsuarioMouseExited

    private void jPasswordContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordContraseñaMouseEntered
        jPasswordContraseña.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_jPasswordContraseñaMouseEntered

    private void jPasswordContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordContraseñaMouseExited
        jPasswordContraseña.setBackground(Color.WHITE);
    }//GEN-LAST:event_jPasswordContraseñaMouseExited

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        ingresar();
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jPasswordContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordContraseñaKeyTyped
        char car = evt.getKeyChar();
        if (car == KeyEvent.VK_ENTER) {
            ingresar();
        }
    }//GEN-LAST:event_jPasswordContraseñaKeyTyped

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
