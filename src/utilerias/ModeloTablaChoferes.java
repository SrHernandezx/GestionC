package utilerias;

import javax.swing.table.DefaultTableModel;


public class ModeloTablaChoferes extends DefaultTableModel{
    
    String [] titulos;
    Object [][] datos;
    
    
    public ModeloTablaChoferes(Object[][] datos, String[] titulos){
        
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