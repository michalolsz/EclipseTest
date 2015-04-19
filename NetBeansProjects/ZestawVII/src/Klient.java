
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.swing.JOptionPane;


public class Klient {
    public static void main(String[] args) throws IOException{
		int n;
                int k;
                int wynik;
                Socket clientSocket = new Socket();
                InetSocketAddress sockAddr=new InetSocketAddress("localhost",9999); 
                try {
                    clientSocket.connect(sockAddr);
                    DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
		            DataInputStream in = new DataInputStream(clientSocket.getInputStream());
                            try{
                               n=Integer.parseInt(JOptionPane.showInputDialog(null,"Podaj n"));
                                k=Integer.parseInt(JOptionPane.showInputDialog(null,"Podaj k"));
                                if(n>=k && k>=0){
                                    out.write(n);
                                    out.write(k);
                                    wynik=in.read();
                                    JOptionPane.showMessageDialog(null,"Wynik to "+wynik);
                                }
                                else JOptionPane.showMessageDialog(null,"Bledne dane - nie mozna dla nich wyliczyc dwumianu"); 
                            }catch(NumberFormatException ex){
                                JOptionPane.showMessageDialog(null,"bledny format danych");
                            }

		} catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Blad polaczenia z serwerem\n"+ex);
                    
		}
                
                         
	}
    
}