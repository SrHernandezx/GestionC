package gui.inicio;

import utilerias.OperacionesBD;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import gui.principal.MenuPrincipal;
import utilerias.Colores;

public class Login extends javax.swing.JFrame {

    private static Login instancia = null;
    private static int intentos;
    
   
    public Login() {

        initComponents();
        this.setTitle("GestionC: Login.");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src//imagenes//Logo.png"));
        OperacionesBD.levantarServidorXampp();
        intentos = 0;
    }

    
    public static Login getInstancia() {
        
        synchronized (Login.class) {
            
            if (instancia == null) {
                
                instancia = new Login();
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
                
                JOptionPane.showMessageDialog(null, "Sistema: Bienvenido " + usuario + ".", "GestionC: Login.", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                MenuPrincipal menu = MenuPrincipal.getInstancia();
                menu.setVisible(true);

            } else {
                
                intentos++;
                
                if (intentos == 3) {
                    
                    JOptionPane.showMessageDialog(null, "Número máximo de intentos excedido", "GestionC: Login.", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                }
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", "GestionC: Login.", JOptionPane.ERROR_MESSAGE);
                borrarFormulario();
            }

        } else {
            intentos ++;
            
            if (intentos == 3) {
                
                JOptionPane.showMessageDialog(null, "Número máximo de intentos excedido", "GestionC: Login.", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
            
            JOptionPane.showMessageDialog(null, "Usuario No escontrado", "GestionC: Login.", JOptionPane.ERROR_MESSAGE);
            borrarFormulario();   
            }    
            
            } else {

                intentos++;
                
                if (intentos == 3) {
                    
                    JOptionPane.showMessageDialog(null, "Número máximo de intentos excedido", "GestionC: Login.", JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);

                }
                
                JOptionPane.showMessageDialog(null, "Usuario No encontrado", "GestionC: Login.", JOptionPane.ERROR_MESSAGE);
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
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(146, 219, 219));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        jTextFieldUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldUsuarioFocusLost(evt);
            }
        });

        jButtonAtras.setBackground(new java.awt.Color(146, 219, 219));
        jButtonAtras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar2.png"))); // NOI18N
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

        jPasswordContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordContraseñaFocusLost(evt);
            }
        });
        jPasswordContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordContraseñaKeyTyped(evt);
            }
        });

        jButtonAceptar.setBackground(new java.awt.Color(146, 219, 219));
        jButtonAceptar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar2.png"))); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jTextFieldUsuario)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonAceptar)))
                .addContainerGap(111, Short.MAX_VALUE))
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
                    .addComponent(jButtonAceptar))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed

        MenuInicio menuInicio = new MenuInicio();
        menuInicio.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_jButtonAtrasActionPerformed
   
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        
        ingresar();
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    
    private void jTextFieldUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusGained

        jTextFieldUsuario.setBackground(Colores.COLOR_FOCO);
        jTextFieldUsuario.selectAll();           

    }//GEN-LAST:event_jTextFieldUsuarioFocusGained

    
    private void jTextFieldUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioFocusLost

        jTextFieldUsuario.setBackground(Color.WHITE);          

    }//GEN-LAST:event_jTextFieldUsuarioFocusLost

    
    private void jPasswordContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordContraseñaFocusGained
        
        jPasswordContraseña.setBackground(Colores.COLOR_FOCO);
        jPasswordContraseña.selectAll();  
        
    }//GEN-LAST:event_jPasswordContraseñaFocusGained

    
    private void jPasswordContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordContraseñaFocusLost
       
        jTextFieldUsuario.setBackground(Color.WHITE);          
           
    }//GEN-LAST:event_jPasswordContraseñaFocusLost

    
    private void jPasswordContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordContraseñaKeyTyped

        char car = evt.getKeyChar();
        
        if (car == KeyEvent.VK_ENTER) {
            
            ingresar();
        } 
    }//GEN-LAST:event_jPasswordContraseñaKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        MenuInicio menuInicio = new MenuInicio();
        menuInicio.setVisible(true);
        this.setVisible(false);     
        
    }//GEN-LAST:event_formWindowClosing

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
