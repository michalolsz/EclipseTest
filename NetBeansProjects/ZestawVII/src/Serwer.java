
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class Serwer extends javax.swing.JFrame {
    public static ServerSocket serverSocket;
    
    public Serwer() {
        initComponents();
        jTextArea1.setText("Serwer zostal uruchomiony\n");
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Serwer nowy=new Serwer();
                nowy.setVisible(true);
                }
        });
        try { 
                serverSocket = new ServerSocket();
                InetSocketAddress sockAddr=new InetSocketAddress("localhost",9999);
                serverSocket.bind(sockAddr);
                while(true){
                           Socket clientSocket;
                           if((clientSocket=serverSocket.accept())!=null){
                                Thread watek=new ClientThread(clientSocket,jTextArea1);
                                watek.start(); 
                           }
                           WindowListener l=new WindowAdapter(){
                            public void windowClosing(WindowEvent e){
                                try {
                                    serverSocket.close();
                                } catch (IOException ex) {
                                    JOptionPane.showMessageDialog(null,"Blad przy zamykaniu gniazda");
                                }
                            }
                            };
             }
                
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(null,ex);
                }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
