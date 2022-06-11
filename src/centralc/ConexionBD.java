
package centralc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ConexionBD {

      protected static String baseDeDatos ="jdbc:mysql://127.0.0.1/bd_centralautobus";
    protected static String driver = "com.mysql.cj.jdbc.Driver";
    protected static String usuario= "root";
    protected static String contra= "";
public static Connection conexion = null;
    public static PreparedStatement pstm = null;
    public static ResultSet rs=null;
    
    public static void main(String[] args) {
        try {
                Class.forName(driver);
                conexion = DriverManager.getConnection(baseDeDatos,usuario, contra);
                String sql= "INSERT INTO  clientes (nombres, apellido_paterno, apellido_materno, genero, fecha_nacimiento,telefono,correo)" + "VALUES (?,?,?,?,?,?,?)";
                pstm = conexion.prepareStatement (sql);
                pstm.setString(1, "Jorge");
                pstm.setString(2, "Hernandez");
                pstm.setString(3, "Avalos");
                pstm.setInt(4, 1);
             //   pstm.setDate(5, '2006-06-06');
               pstm.setInt(6, 833110035);
               pstm.setString(7, "dfjofo@outlook.com");
               
             int resultado = pstm.executeUpdate();
                if(resultado==1){
                    System.out.println("1 fila insertada correctamente");
                }else{
                    System.out.println("No se puedo insertar la fila");
                }
                
                }
             catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
}
}    

