package gui.usuarios;

import java.awt.event.KeyEvent;
import gui.principal.MenuPrincipal;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;
import utilerias.Colores;
import utilerias.GestionCeldas;
import utilerias.GestionEncabezadoTablaUsuarios;
import utilerias.LongitudesAtributosBD;
import utilerias.ModeloTablaUsuarios;
import utilerias.OperacionesBD;


public class GestionUsuarios extends javax.swing.JFrame {

    private static GestionUsuarios instancia = null;
    
    ModeloTablaUsuarios modeloConsultas;
    
    
    public GestionUsuarios() {
        
        initComponents();
        this.setTitle("GestionC. Gestión de usuarios.");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src//img//clientes.png"));
        OperacionesBD.levantarServidorXampp();
        Object[][] datos = OperacionesBD.buscarUsuarios();
        construirTabla(datos); 
    }
    
    
    public static GestionUsuarios getInstancia(){
        
        synchronized(GestionUsuarios.class){
            
            if (instancia == null) {
                
                instancia = new GestionUsuarios();
            }
        }
        
        return instancia;
    }
    
    
public void construirTabla(Object[][] data){
        
        String titulos[] = {"No." , "Id. Usuario", "Nombre"};
        
        Object[][] datos = new Object[data.length][3];
        
        for (int i = 0; i < datos.length; i++){
            
            datos[i][0] = i + 1;
            datos[i][1] = data[i][0];
            datos[i][2] = data [i][1];
        }
        
        modeloConsultas = new ModeloTablaUsuarios(datos, titulos);
        
        //
        jTableUsuarios.setModel(modeloConsultas);
        
        jTableUsuarios.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        jTableUsuarios.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("numerico"));
        jTableUsuarios.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        
        jTableUsuarios.getColumnModel().getColumn(0).setMinWidth(100);
        jTableUsuarios.getColumnModel().getColumn(0).setMaxWidth(100);
        
        jTableUsuarios.getColumnModel().getColumn(1).setMinWidth(100);
        jTableUsuarios.getColumnModel().getColumn(1).setMaxWidth(100);
        
        jTableUsuarios.getColumnModel().getColumn(2).setMinWidth(400);
        jTableUsuarios.getColumnModel().getColumn(2).setMaxWidth(400);
        
        
        jTableUsuarios.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableUsuarios.setShowGrid(true);
        jTableUsuarios.getTableHeader().setReorderingAllowed(false);
        jTableUsuarios.setGridColor(Color.BLACK);
        jTableUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        JTableHeader jtableHeader = jTableUsuarios.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTablaUsuarios());
        jTableUsuarios.setTableHeader(jtableHeader);
        jTableUsuarios.setRowHeight(30);
    }    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jButtonEliminar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonBuscarTodos = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(146, 219, 219));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        jTextFieldBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldBuscarFocusLost(evt);
            }
        });
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });

        jTableUsuarios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ));
        jTableUsuarios.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jScrollPane1.setViewportView(jTableUsuarios);
        if (jTableUsuarios.getColumnModel().getColumnCount() > 0) {
            jTableUsuarios.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jButtonEliminar.setToolTipText("Borrar.");
        jButtonEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambios.png"))); // NOI18N
        jButtonEditar.setToolTipText("Modificar.");
        jButtonEditar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonBuscarTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButtonBuscarTodos.setToolTipText("Actualizar.");
        jButtonBuscarTodos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonBuscarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarTodosActionPerformed(evt);
            }
        });

        jButtonAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altas.png"))); // NOI18N
        jButtonAgregar.setToolTipText("Agregar.");
        jButtonAgregar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBuscarTodos)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBuscarTodos, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
       
       this.setVisible(false);
       AgregarUsuario nuevoUsuario = AgregarUsuario.getInstancia(this, true);
       nuevoUsuario.setVisible(true);
        
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        int fila = jTableUsuarios.getSelectedRow();
        if (fila < 0 ) {
            
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro", "GestionC: Modificar usuario", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            int id_usuario = Integer.valueOf(jTableUsuarios.getValueAt(fila, 1).toString());
            String nombre = jTableUsuarios.getValueAt(fila, 2).toString();
            
            this.setVisible(false);
            
            ModificarUsuario modificarUsuario = ModificarUsuario.getInstancia(this, true);
            
            modificarUsuario.datosUsuario = OperacionesBD.buscarUsuario(id_usuario);
            
            modificarUsuario.jTextFieldNombre.setText(modificarUsuario.datosUsuario[1].toString());
            
            modificarUsuario.jPasswordFieldContraseña.setText(modificarUsuario.datosUsuario[2].toString());
            
            modificarUsuario.setVisible(true);
        }
        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarTodosActionPerformed

        buscarTodosUsuarios();

    }//GEN-LAST:event_jButtonBuscarTodosActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed

        int fila = jTableUsuarios.getSelectedRow();
        
        if (fila< 0) {
            
            JOptionPane.showMessageDialog(null, "Debe selecionar un registro", "GestionC: Eliminar usuario", JOptionPane.ERROR_MESSAGE);
            
        }else{
            
            int id_usuario = Integer.valueOf(jTableUsuarios.getValueAt(fila, 1).toString());
            String nombre = jTableUsuarios.getValueAt(fila, 2).toString();
            
            Object[]opciones ={"Aceptar","Cancelar"};
            
            int respuesta = JOptionPane.showOptionDialog(null, "<html>¿Desea eliminar al usuario <b><i><font color = \"red\">" + nombre + "</font></b>?</html>", "GestionC: Eliminar usuario",JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,"Cancelar");
            
            if (respuesta == JOptionPane.YES_OPTION) {
                
                OperacionesBD.eliminarUsuario(id_usuario);
            }
        }


    }//GEN-LAST:event_jButtonEliminarActionPerformed

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        cerrar();   
       

    }//GEN-LAST:event_formWindowClosing

    
    private void jTextFieldBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscarFocusGained
        
        jTextFieldBuscar.setBackground(Colores.COLOR_FOCO);
        jTextFieldBuscar.selectAll();        
    
    }//GEN-LAST:event_jTextFieldBuscarFocusGained

    
    private void jTextFieldBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldBuscarFocusLost
        
        jTextFieldBuscar.setBackground(Color.WHITE);
        
        
    }//GEN-LAST:event_jTextFieldBuscarFocusLost

    
    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped

        char c = evt.getKeyChar();
        int posCursor = jTextFieldBuscar.getCaretPosition();
        String texto = jTextFieldBuscar.getText();
        
        if (texto.length()+ 1 > LongitudesAtributosBD.LONGITUD_NOMBRE_USUARIO) {
            
            evt.consume();
            
        }else{
            
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < 'O' || c > '9') && (c != 'ñ') && (c != 'Ñ') && (c != 'á') && (c != 'é') && (c != 'í') && (c != 'ó') && (c != 'ú') && (c != 'Á') && (c != 'É') && (c != 'Í') && (c != 'Ó') && (c != 'Ú')){
            
                evt.consume();
                
        }else {
               if (c != KeyEvent.VK_BACK_SPACE) {
                   
                texto = colocaCaracter(texto, posCursor, c);
                
              }else{
                   
                texto = jTextFieldBuscar.getText();
                }
        }
            
        String usuarios[][] = OperacionesBD.buscarUsuarios(texto);
        construirTabla(usuarios);
        
        }
  
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        buscarTodosUsuarios();
  
    }//GEN-LAST:event_formWindowGainedFocus

    
    private void buscarTodosUsuarios(){
        
        Object[][] datos = OperacionesBD.buscarUsuarios();
        
        construirTabla(datos);
        jTextFieldBuscar.setText("");
        jTextFieldBuscar.requestFocus();
    }
    
    private String colocaCaracter(String texto, int posCursor, char c){
        
        String texto1 = texto.substring(0, posCursor) + c;
        String texto2 = "";
        
        if (texto.length() > 0) {
            
            texto2 = texto.substring(posCursor, texto.length());
        }
        
        return texto1 + texto2;
    }
    
    
    private void cerrar(){
        
        this.setVisible(false);
        MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
    }    
    
   
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBuscarTodos;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
