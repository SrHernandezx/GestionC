
package utilerias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class OperacionesBD {

    protected static String baseDeDatos = "jdbc:mysql://127.0.0.1/gestionc2";
    protected static String driver = "com.mysql.jdbc.Driver";
    
    public static Connection conexion = null;
    public static PreparedStatement pstm = null;
    public static ResultSet rs = null;
    public static boolean conexionActiva = false;
    public static boolean servidorActivo = false;
    
        public static void levantarServidorXampp(){
        
        establecerSesion("root", "");
        conexionActiva = true;
        servidorActivo = true;
    }
    
    
    public static void detenerServidorXampp(){
        
        //PENDIENTE
    }
    
    
    public static void establecerSesion(String usuario, String contraseña){
        
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(baseDeDatos, usuario, contraseña);
            conexionActiva = true;
            
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            conexionActiva = false;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            conexionActiva = false;
        }
    }

    
    public static boolean conexionActiva(){
        
        return conexionActiva;
    }
    
    
    public static boolean servidorActivo(){
        
        return servidorActivo;
    }
    
    //USUARIOS
    
    public static String[] buscarUsuario(String usuario){
        
        String[] datos = new String[2];
        
        if(conexionActiva){
            
            try {
                
                String sql = "SELECT nombre, contraseña FROM usuarios WHERE nombre " + "COLLATE utf8_spanish_ci = \"" + usuario + "\"";
                
                pstm = conexion.prepareStatement(sql);
                rs = pstm.executeQuery();
                rs.last();
                int registros = rs.getRow();
                rs.first();
                
                if(registros != 1){
                    
                    return null;
                    
                } else{
                    
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }
    
    
    public static Object[] buscarUsuario(int id_usuario){
        
        Object[] datos = new Object[3];
        
        if(conexionActiva){
            
            try {
                
                String sql = "SELECT * FROM usuarios WHERE id_usuario = " + id_usuario;
                pstm = conexion.prepareStatement(sql);
                rs = pstm.executeQuery();
                rs.last();
                int registros = rs.getRow();
                rs.first();
            
                if(registros != 1){
                    
                    return null;
                    
                }
                else {

                    datos[0] = rs.getObject(1);
                    datos[1] = rs.getObject(2);
                    datos[2] = rs.getObject(3);   
                }
            } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }
    
    
    public static Object[][] buscarUsuarios(){
        
        Object[][] datos = null;

        if(conexionActiva){
            
            try {
                
                String sql = "SELECT id_usuario, nombre FROM usuarios";
               
                pstm = conexion.prepareStatement(sql);
                rs = pstm.executeQuery();
                rs.last();
                int registros = rs.getRow();
                rs.beforeFirst();
                datos = new Object[registros][2];
                int contador = 0;
 
                while(rs.next()){
                    
                    datos[contador][0] = rs.getObject(1);
                    datos[contador][1] = rs.getObject(2);     
                    contador++;
                }
            } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }  
    
    
    public static String[][] buscarUsuarios(String usuario){
        
        String[][] datos = null;

        if(conexionActiva){
            
            try {
                
                String sql = "SELECT id_usuario, nombre FROM usuarios WHERE nombre LIKE '%" + usuario + "%'";
               
                pstm = conexion.prepareStatement(sql);
                rs = pstm.executeQuery();
                rs.last();
                int registros = rs.getRow();
                rs.beforeFirst();
                datos = new String[registros][2];
                int contador = 0;
 
                while(rs.next()){
                    
                    datos[contador][0] = rs.getString(1);
                    datos[contador][1] = rs.getString(2);     
                    contador++;
                }
            } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }
    
    
    public static void eliminarUsuario(int id_usuario){
        
        if(conexionActiva){

            try {
                
                String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
                
                pstm = conexion.prepareStatement(sql);
                pstm.setInt(1, id_usuario);
                
                int resultado = pstm.executeUpdate();
                
                if(resultado == 1){
                    
                    JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al elinar el registro", "Eliminar", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static void insertarUsuario(String nombre, String contra){
        
        if(conexionActiva){

            try {
                
                String sql = "INSERT INTO usuarios (nombre, contraseña) VALUES (?,?)";
                
                pstm = conexion.prepareStatement(sql);
                pstm.setString(1, nombre);
                pstm.setString(2, contra);
                
                int resultado = pstm.executeUpdate();
                
                if(resultado == 1){
                    
                    JOptionPane.showMessageDialog(null, "Registro insertado exitosamente", "GestionC: Agregar usuario", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "El registro no se pudo insertar", "GestionC: Agregar usuario", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    } 
    
    
    public static void modificarUsuario (int id_usuario, String nombre, String contraseña){
        
        if(conexionActiva){

            try {
                
                String sql = "UPDATE usuarios SET " + "nombre = ?, contraseña = ?" + "WHERE id_usuario = ?";
                
                pstm = conexion.prepareStatement(sql);
                pstm.setString(1, nombre);
                pstm.setString(2, contraseña);
                pstm.setInt(3, id_usuario);

                int resultado = pstm.executeUpdate();
                
                if(resultado == 1){
                    
                    JOptionPane.showMessageDialog(null, "Registro modificado exitosamente", "GestionC: Modificar usario", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al modificar el registro", "GestionC: Modificar usario", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    // CLIENTES.
    
    
    public static Object[][] buscarCliente(){
        
        Object[][] datos = null;

        if(conexionActiva){
            
            try {
                
                String sql = "SELECT id_cliente, nombres, apellido_paterno, apellido_materno, genero, fecha_nacimiento" + "FROM clientes";
               
                pstm = conexion.prepareStatement(sql);
                rs = pstm.executeQuery();
                rs.last();
                int registros = rs.getRow();
                rs.beforeFirst();
                datos = new Object[registros][6];
                int contador = 0;
 
                while(rs.next()){
                    
                    datos[contador][0] = rs.getObject(1);
                    datos[contador][1] = rs.getObject(2); 
                    datos[contador][2] = rs.getObject(3);
                    datos[contador][3] = rs.getObject(4);
                    datos[contador][4] = rs.getObject(5);
                    datos[contador][4] = rs.getObject(6);
                    
                    contador++;
                }
            } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    }  
    
    
    public static Object[][] buscarCliente(String cliente){
        
        Object[][] datos = null;

        if(conexionActiva){
            
            try {
                
                String sql = "SELECT id_cliente, nombres, apellido_paterno, apellido_materno, fecha_nacimiento " + "FROM clientes WHERE nombres LIKE '%" + cliente + "%' " + "OR apellido_paterno LIKE '%"+ cliente + "%' " + "OR apellido_materno LIKE '%" + cliente + "%' ";
               
                pstm = conexion.prepareStatement(sql);
                rs = pstm.executeQuery();
                rs.last();
                int registros = rs.getRow();
                rs.beforeFirst();
                datos = new Object[registros][6];
                int contador = 0;
 
                while(rs.next()){
                    
                    datos[contador][0] = rs.getObject(1);
                    datos[contador][1] = rs.getObject(2); 
                    datos[contador][2] = rs.getObject(3);
                    datos[contador][3] = rs.getObject(4);
                    datos[contador][4] = rs.getObject(5);
                    datos[contador][4] = rs.getObject(6);
                    
                    contador++;
                }
            } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return datos;
    } 
    
    
    public static void eliminarCliente(int id_contacto){
        
        if(conexionActiva){

            try {
                
                String sql = "DELETE FROM clientes WHERE id_cliente = ?";
                
                pstm = conexion.prepareStatement(sql);
                pstm.setInt(1, id_contacto);
                
                int resultado = pstm.executeUpdate();
                
                if(resultado == 1){
                    
                    JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente", "Eliminar", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el registro", "Eliminar", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    public static int insertarCliente(String nombres, String ape_paterno, String ape_materno, int id_genero, String fecha_nac){
    
        int resultado = -1;
        
        if(conexionActiva){
            
            try {
                
                String sql = "INSERT INTO clientes (nombres, apellido_paterno, apellido_materno, genero, fecha_nacimiento" + "VALUES (?,?,?,?,?)";
               
                pstm = conexion.prepareStatement(sql);
                pstm.setString(1, nombres);
                pstm.setString(2, ape_paterno);
                pstm.setString(3, ape_materno);
                pstm.setInt(4, id_genero);
                pstm.setString(5, fecha_nac);
      
                
                resultado = pstm.executeUpdate();
               
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El registro no se pudo insertar","GestionC: agregar contacto", JOptionPane.ERROR_MESSAGE);
            }
        }
        return resultado;
    }    
    
   // 
    
}
    

