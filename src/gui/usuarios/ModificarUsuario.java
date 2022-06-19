package gui.usuarios;

import java.awt.event.KeyEvent;
import java.awt.Color;
import utilerias.Colores;
import utilerias.LongitudesAtributosBD;
import utilerias.OperacionesBD;


public class ModificarUsuario extends javax.swing.JDialog {
    
    private static ModificarUsuario instancia = null;
    public static Object[] datosUsuario;
    

    public ModificarUsuario(java.awt.Frame parent, boolean modal) {
        
        super(parent, modal);
        initComponents();
        OperacionesBD.levantarServidorXampp();
        this.setResizable(false);
        this.setTitle("GestionC. Modificar usuario.");   
        this.setLocationRelativeTo(null);
        jLabelNotas.setText("<html><font color = \"red\"><b>Nota:</b></font> " + "El nombre y la contraseña  puden tener un máximo de 15 caracteres, " + "pueden incluir vocales acentuadas, mayúsculas y minúsculas, " + "números y las letras \"ñ\" y \"Ñ\". </html>");
    }
    
    
    public static ModificarUsuario getInstancia(java.awt.Frame parent, boolean modal){
        
        synchronized (ModificarUsuario.class){
            
            if(instancia == null){
                instancia = new ModificarUsuario(parent, modal);
            }
        }
        return instancia;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonAceptar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jLabelUsuarioDuplicado = new javax.swing.JLabel();
        jLabelNotas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(146, 219, 219));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel2.setToolTipText("");

        jTextFieldNombre.setBackground(new java.awt.Color(146, 219, 219));
        jTextFieldNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Nombre:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jTextFieldNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNombreFocusLost(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jButtonAceptar.setBackground(new java.awt.Color(146, 219, 219));
        jButtonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar2.png"))); // NOI18N
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setToolTipText("Aceptar.");
        jButtonAceptar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(146, 219, 219));
        jButtonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar2.png"))); // NOI18N
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Cancelar.");
        jButtonCancelar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        jPasswordFieldContraseña.setBackground(new java.awt.Color(146, 219, 219));
        jPasswordFieldContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Contraseña:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPasswordFieldContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldContraseñaFocusLost(evt);
            }
        });
        jPasswordFieldContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordFieldContraseñaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabelUsuarioDuplicado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelUsuarioDuplicado, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        jLabelNotas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNotas, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
     
        String nombre = jTextFieldNombre.getText();
        String contra = String.valueOf(jPasswordFieldContraseña.getPassword());
        OperacionesBD.modificarUsuario((int) datosUsuario[0], nombre, contra);
        borrarFormulario();
        this.setVisible(false);
        GestionUsuarios gestionUsuarios = GestionUsuarios.getInstancia();
        gestionUsuarios.setVisible(true);         
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        
        GestionUsuarios a =  new GestionUsuarios();
        a.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusGained

        jTextFieldNombre.setBackground(Colores.COLOR_FOCO);
        jTextFieldNombre.selectAll();

        
    }//GEN-LAST:event_jTextFieldNombreFocusGained

    private void jTextFieldNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNombreFocusLost

        jTextFieldNombre.setBackground(Color.WHITE); 
                
    }//GEN-LAST:event_jTextFieldNombreFocusLost

    
    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped

        char c = evt.getKeyChar();
        
        int posCursor = jTextFieldNombre.getCaretPosition();
        
        String texto = jTextFieldNombre.getText();
        
        if(texto.length() + 1 > LongitudesAtributosBD.LONGITUD_NOMBRE_USUARIO){
            
            evt.consume();

        }
        else{
            
            if((c < 'a' || c > 'z' ) && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && (c != 'ñ') && (c != 'Ñ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú') && (c != 'Á') && (c != 'É') && (c != 'Í') && (c != 'Ó') && (c != 'Ú')){
            
                evt.consume();
            }
            else{
                
                if(c != KeyEvent.VK_BACK_SPACE){
                    
                    texto = colocaCaracter(texto, posCursor, c);
                }
                else{
                    
                    texto = jTextFieldNombre.getText();
            }
        }
        
            //Busqueda SQL
        
            String usuarios[] = OperacionesBD.buscarUsuario(texto);
       
            if (usuarios != null && !datosUsuario[1].equals(usuarios[0])){
                
                String mensaje = "<html><font color = \"red\"><b>" + "Usuario ya registrado en la Base de datos</b></font></html>";
                jLabelUsuarioDuplicado.setText(mensaje);
                jButtonAceptar.setEnabled(false);
                jPasswordFieldContraseña.setEnabled(false);
            }
            else{
            
                jLabelUsuarioDuplicado.setText("");
                jButtonAceptar.setEnabled(true);
                jPasswordFieldContraseña.setEnabled(true);               
            }
        }    

    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jPasswordFieldContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusGained

        jPasswordFieldContraseña.setBackground(Colores.COLOR_FOCO);
        jPasswordFieldContraseña.selectAll();

    }//GEN-LAST:event_jPasswordFieldContraseñaFocusGained

    private void jPasswordFieldContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaFocusLost

        jPasswordFieldContraseña.setBackground(Color.WHITE); 


    }//GEN-LAST:event_jPasswordFieldContraseñaFocusLost

    
    private void jPasswordFieldContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldContraseñaKeyTyped

        char c = evt.getKeyChar();
        int totalCaracteres = jPasswordFieldContraseña.getPassword().length + 1;
  
        if((totalCaracteres > LongitudesAtributosBD.LONGITUD_CONTRASEÑA_USUARIO) || (c < 'a' || c > 'z' ) && (c < 'A' || c > 'Z') && (c < '0' || c > '9') && (c != 'ñ') && (c != 'Ñ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú') && (c != 'Á') && (c != 'É') && (c != 'Í') && (c != 'Ó') && (c != 'Ú')){
            
            evt.consume();
        }     
  
    }//GEN-LAST:event_jPasswordFieldContraseñaKeyTyped

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.dispose();
        GestionUsuarios a = GestionUsuarios.getInstancia();
        a.setVisible(true);        

    }//GEN-LAST:event_formWindowClosing

    
    private String colocaCaracter(String texto, int posCursor, char c){
        
        String texto1 = texto.substring(0, posCursor) + c;
        String texto2 = "";
        
        if(texto.length() > 0){
            texto2 = texto.substring(posCursor, texto.length());
        }
        return texto1 + texto2;
    }   
    
    
    private void borrarFormulario(){
        
        jTextFieldNombre.setText("");
        jPasswordFieldContraseña.setText("");
        jTextFieldNombre.requestFocus();
    }
    
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windwos".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                ModificarUsuario dialog = new ModificarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    public static javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNotas;
    private javax.swing.JLabel jLabelUsuarioDuplicado;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JPasswordField jPasswordFieldContraseña;
    public static javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
