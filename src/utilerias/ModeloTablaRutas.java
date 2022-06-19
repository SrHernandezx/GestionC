package utilerias;

import javax.swing.table.DefaultTableModel;


public class ModeloTablaRutas extends DefaultTableModel{
    
    String [] titulos;
    Object [][] datos;
    
    
    public ModeloTablaRutas(Object[][] datos, String[] titulos){
        
        super();
        this.titulos = titulos;
        this.datos = datos;
        setDataVector(datos, titulos);
    }
    
    
    public boolean isCellEditable(int row, int colum){
        
        // Definimos si una celda pude ser o no editable.
        
        return false;
    }        
}