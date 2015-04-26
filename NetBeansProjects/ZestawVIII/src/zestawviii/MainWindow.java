
package zestawviii;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class MainWindow extends javax.swing.JFrame {
    private List<TrasaPrzewozu> trasy;
    public JList getListTowaryKierowcy(){
        return listTowaryKierowcy;
    }
    public JTable getTableKierowcy(){
        return tableKierowcy;
    }
    public List<TrasaPrzewozu> getTrasy(){
        return trasy;
    }
    public void UpdateListaTowarow(int idx){
        DefaultListModel model=new DefaultListModel();
        List<String> towary=getTrasy().get(idx).getTowary();
        for(String towar:towary)
            model.addElement(towar);
        listTowaryKierowcy.setModel(model);
    }

    
    public MainWindow() {
        initComponents();
        trasy=new ArrayList<>();
        KierowcyTableModel model=new KierowcyTableModel(this);
        tableKierowcy.getSelectionModel().addListSelectionListener(new RowListener(this));    
        addWindowListener(new WindowAdapter() {
        public void windowOpened(WindowEvent evt){   
                TrasaPrzewozu trasa1=new TrasaPrzewozu("Bydgoszcz","Torun",50,"kierowca1");
                trasy.add(trasa1);
                TrasaPrzewozu trasa2=new TrasaPrzewozu("Bydgoszcz","Gdansk",200,"kierowca2");
                trasy.add(trasa2);
                String[] kierowcy={trasa1.getKierowca(),trasa2.getKierowca()};
                JComboBox comboKierowcy=new JComboBox(kierowcy);
                tableKierowcy.setModel(model);
                tableKierowcy.getColumnModel().getColumn(3).setCellEditor(new DefaultCellEditor(comboKierowcy));  
            }
        });
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableKierowcy = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        listTowaryKierowcy = new javax.swing.JList();
        textTowar = new javax.swing.JTextField();
        buttonDodaj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableKierowcy.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Skąd", "Dokąd", "KM", "Kierowca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableKierowcy);

        jScrollPane2.setViewportView(listTowaryKierowcy);

        textTowar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTowarActionPerformed(evt);
            }
        });

        buttonDodaj.setText("Dodaj");
        buttonDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDodajActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textTowar, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonDodaj)))
                .addGap(0, 163, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTowar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDodaj))
                .addGap(0, 34, Short.MAX_VALUE))
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

    private void textTowarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTowarActionPerformed

    }//GEN-LAST:event_textTowarActionPerformed

    private void buttonDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDodajActionPerformed
        String towar=textTowar.getText();
        getTrasy().get(tableKierowcy.getSelectedRow()).dodajTowar(towar);
        UpdateListaTowarow(tableKierowcy.getSelectedRow());
    }//GEN-LAST:event_buttonDodajActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDodaj;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listTowaryKierowcy;
    private javax.swing.JTable tableKierowcy;
    private javax.swing.JTextField textTowar;
    // End of variables declaration//GEN-END:variables
}
