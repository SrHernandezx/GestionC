package gui.clientes;

import java.awt.Toolkit;
import gui.principal.MenuPrincipal;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;
import utilerias.GestionCeldas;
import utilerias.GestionEncabezadoTablaClientes;
import utilerias.ModeloTablaClientes;
import utilerias.OperacionesBD;

public class GestionClientes extends javax.swing.JFrame {

   private static GestionClientes instancia = null;
   ModeloTablaClientes modeloConsultas;    

    
    public GestionClientes() {
        
        initComponents();
        
        this.setTitle("Certificados ITA: Gestion de estudiantes.");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("src//clientes//Estudiante.png"));
        OperacionesBD.levantarServidorXampp();
        Object[][] datos = OperacionesBD.buscarCliente();
        construirTabla(datos);
    }
    
    
    public static GestionClientes getInstancia(){
        
        synchronized (GestionClientes.class){
            
            if (instancia == null){
                
                instancia = new GestionClientes();
            }
        }
        
        return instancia;
    }
    
    
    public void construirTabla(Object[][] data){
        
        /*String titulos[] = {"No.", "ID. Cliente", "Nombre", "Genero", "Fecha de nacimiento"};
        
        Object[][] datos = new Object[data.length][titulos.length];
        
        for (int i = 0; i < datos.length; i++){
            
            datos[i][0] = i + 1;
            datos[i][1] = data[i][0];
            datos[i][2] = data[i][1] + " " + data[i][2] + " " + data[i][3];
            datos[i][3] = data[i][4];
            datos[i][4] = data[i][5];
            
        }
        
        modeloConsultas = new ModeloTablaClientes(datos, titulos);
        
        // se asigna el modeloConsultas a la tabla;
        
        jTableClientes.setModel(modeloConsultas);
        
        // Se asigna el tipo de datos que tendran las celdas de cada columna definida respectivamente para validar su personalizacion.
       
        jTableClientes.getColumnModel().getColumn(0).setCellRenderer(new GestionCeldas("numerico"));
        jTableClientes.getColumnModel().getColumn(1).setCellRenderer(new GestionCeldas("numerico"));
        jTableClientes.getColumnModel().getColumn(2).setCellRenderer(new GestionCeldas("texto"));
        jTableClientes.getColumnModel().getColumn(3).setCellRenderer(new GestionCeldas("numerico"));
        jTableClientes.getColumnModel().getColumn(4).setCellRenderer(new GestionCeldas("fecha"));
        
        jTableClientes.getColumnModel().getColumn(0).setMinWidth(100);
        jTableClientes.getColumnModel().getColumn(0).setMaxWidth(100);
        
        jTableClientes.getColumnModel().getColumn(1).setMinWidth(100);
        jTableClientes.getColumnModel().getColumn(1).setMaxWidth(100);
        
        jTableClientes.getColumnModel().getColumn(2).setMinWidth(300);
        jTableClientes.getColumnModel().getColumn(2).setMaxWidth(300);
        
        jTableClientes.getColumnModel().getColumn(3).setMinWidth(200);
        jTableClientes.getColumnModel().getColumn(3).setMaxWidth(200);
        
        jTableClientes.getColumnModel().getColumn(4).setMinWidth(200);
        jTableClientes.getColumnModel().getColumn(4).setMaxWidth(200);
       

        
        jTableClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTableClientes.setShowGrid(true);
        jTableClientes.getTableHeader().setReorderingAllowed(false);
        jTableClientes.setGridColor(Color.BLACK);
        jTableClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        //personaliza el encabezado
        
        JTableHeader jtableHeader = jTableClientes.getTableHeader();
        jtableHeader.setDefaultRenderer(new GestionEncabezadoTablaClientes());
        jTableClientes.setTableHeader(jtableHeader);
        jTableClientes.setRowHeight(30);
    }   
    
    
    
    private void buscarTodosClientes(){
         
        Object[][] datos = OperacionesBD.buscarCliente();
        construirTabla(datos);
        jTextFieldBuscar.setText("");
        jTextFieldBuscar.requestFocus();  
    }    
    */

    /*private String colocaCaracter(String texto, int posCursor, char c){
        
        String texto1 = texto.substring(0, posCursor) + c;
        String texto2 = "";
        
        if (texto.length()> 0) {
            
            texto2 = texto.substring(posCursor, texto.length());
        }
        
        return texto1 + texto2;
    }
*/
    
    /*private void cerrar(){
        
        this.setVisible(false);
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonCambios = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonAltas = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(146, 219, 219));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jTableClientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombres", "Apellido paterno", "Apellido materno", "Género", "Fecha de nacimiento", "Correo", "Teléfono"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        jTextFieldBuscar.setBackground(new java.awt.Color(146, 219, 219));

        jButtonCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cambios.png"))); // NOI18N
        jButtonCambios.setToolTipText("Editar.");
        jButtonCambios.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiosActionPerformed(evt);
            }
        });

        jButtonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jButtonActualizar.setToolTipText("Actualizar.");
        jButtonActualizar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        jButtonAltas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/altas.png"))); // NOI18N
        jButtonAltas.setToolTipText("Añadir.");
        jButtonAltas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltasActionPerformed(evt);
            }
        });

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        jButtonEliminar.setToolTipText("Borrar.");
        jButtonEliminar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Buscar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonAltas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCambios)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonActualizar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonActualizar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonCambios, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAltas)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltasActionPerformed
        
        
    }//GEN-LAST:event_jButtonAltasActionPerformed

    
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed


    }//GEN-LAST:event_jButtonEliminarActionPerformed

    
    private void jButtonCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiosActionPerformed
        
        
        
    }//GEN-LAST:event_jButtonCambiosActionPerformed

    
    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
 
        
    }//GEN-LAST:event_jButtonActualizarActionPerformed

    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        this.setVisible(false);
        MenuPrincipal a = new MenuPrincipal();
        a.setVisible(true);
    
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
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAltas;
    private javax.swing.JButton jButtonCambios;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
