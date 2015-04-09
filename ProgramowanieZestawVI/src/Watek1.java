
public class Watek1 extends Thread {
	private int id;
	private int[] tab;
	private int n;
	public Watek1(int id,int tab[]){
			this.id=id;
			this.tab=tab;
			this.n=tab.length;
	}
	public long getId(){
		return id;
	}
	public void run() {
		tab[(int) getId()]=0;		
	}	

}
