
package zestawviii;

import java.util.List;
import javax.swing.table.AbstractTableModel;


public class KierowcyTableModel extends AbstractTableModel{
    private List<TrasaPrzewozu> trasy;
    private String[] kolumny={"Skad","Dokad","Km","Kierowca"};
    private MainWindow mw;

    public KierowcyTableModel(MainWindow mw) {
        this.mw=mw;
        trasy=mw.getTrasy();
    }

    @Override
    public int getRowCount() {    
        return trasy.size();
    }

    @Override
    public int getColumnCount() {
        return kolumny.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:{
                return trasy.get(rowIndex).getTrasaPoczatek(); 
            }
            case 1:{
                return trasy.get(rowIndex).getTrasaKoniec(); 
            }
            case 2:{
                return trasy.get(rowIndex).getKm(); 
            }
            case 3:{
                return trasy.get(rowIndex).getKierowca(); 
            }
        }
        return null;
    }
    public String getColumnName(int column){
        return kolumny[column];
    }
    public Class getColumnClass(int column){
        switch(column){
            case 0:{
                return trasy.get(0).getTrasaPoczatek().getClass(); 
            }
            case 1:{
                return trasy.get(0).getTrasaKoniec().getClass(); 
            }
            case 2:{
                return new Integer(trasy.get(0).getKm()).getClass(); 
            }
            case 3:{
                return trasy.get(0).getKierowca().getClass(); 
            }
        }
        return null;
    }
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:{
                 trasy.get(rowIndex).setTrasaPoczatek((String) aValue); 
                 break;
            }
            case 1:{
                trasy.get(rowIndex).setTrasaKoniec((String) aValue); 
                break;
            }
            case 2:{
                try{
                    trasy.get(rowIndex).setKm((Integer)(aValue));
                    break;
                }catch(Exception e){
                    System.out.println(e);
                }
            }
            case 3:{
                trasy.get(rowIndex).setKierowca((String) aValue); 
                break;
            }
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }
    
}
