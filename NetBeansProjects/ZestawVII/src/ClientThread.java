import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class ClientThread extends Thread{
	Socket clientSocket;
        int n;
        int k;
        int wynik;
        JTextArea jTextArea1;
	public ClientThread(Socket clientSocket,JTextArea jTextArea1){
		this.clientSocket=clientSocket;
                this.jTextArea1=jTextArea1;
	}
	public int NnadK(int n,int k){
		int[][] tab=new int[n+1][k+1];
		for(int i=0;i<=n;i++)
			for(int j=0;j<=Math.min(i, k);j++)
			{
				if ((j == 0) || (j == i))  tab[i][j]=1;
				else tab[i][j]=tab[i-1][j-1]+tab[i-1][j];
			}
		return tab[n][k];
	}
	public void run() {	
		try {
                        DataInputStream in = new DataInputStream(clientSocket.getInputStream());
			n = in.read();
			k = in.read();
			wynik=NnadK(n, k);
			DataOutputStream out=new DataOutputStream(clientSocket.getOutputStream());
			out.write(wynik);
                        SwingUtilities.invokeLater(new Runnable() 
                            { 
                                public void run() { 
                                   jTextArea1.append("N= "+n+" K="+k+" wynik = "+wynik+"\n");                      
                                } 
                            });
                        clientSocket.close();
		} catch (IOException e) {
                        JOptionPane.showMessageDialog(null,e);
		
		}
					
	}
}
