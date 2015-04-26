
package zestawviii;

import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RowListener implements ListSelectionListener{
    private MainWindow mw;
    public RowListener(MainWindow mw){
        this.mw=mw;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
        if(e.getValueIsAdjusting()==false) mw.UpdateListaTowarow(lsm.getMinSelectionIndex());
    }
    
}
