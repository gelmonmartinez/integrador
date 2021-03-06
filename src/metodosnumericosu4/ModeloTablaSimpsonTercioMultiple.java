package metodosnumericosu4;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Juan Carlos Estrella
 */
public class ModeloTablaSimpsonTercioMultiple extends AbstractTableModel{
    
    private ArrayList<FilaSimpsonTercioMultiple> lista = new ArrayList<FilaSimpsonTercioMultiple>();
    private String[] columnas = {"i", "h", "a+ih", "f(a+ih)"};

    public ModeloTablaSimpsonTercioMultiple(ArrayList<FilaSimpsonTercioMultiple> lista) {
        this.lista = lista;
    }

    public ModeloTablaSimpsonTercioMultiple() {
    }

    @Override
    public int getRowCount() {
        return this.lista.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return this.lista.get(fila).getI();
            case 1:
                return this.lista.get(fila).getH();
            case 2:
                return this.lista.get(fila).getAih();
            case 3:
                return this.lista.get(fila).getFaih();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        return this.columnas[column]; //To change body of generated methods, choose Tools | Templates.
    }
    
}
