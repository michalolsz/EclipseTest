package rozdzial9;

import java.util.ArrayList;
import java.util.List;

class Camera{
	public String nazwa;
	private int cena;
	private boolean dostepny;
	Camera(String nazwa,int cena,boolean dostepny){
		this.nazwa=nazwa;
		this.cena=cena;
		this.dostepny=dostepny;
	}
	public int getCena(){
		return cena;
	}
	public boolean getDostepny(){
		return dostepny;
	}
	public String toString(){
		return nazwa;
	}
}
public class ParrarelStream {

	public static void main(String[] args) {
		List<Camera> kamery=new ArrayList<>();
		kamery.add(new Camera("1",500, true));
		kamery.add(new Camera("2",600, false));
		kamery.add(new Camera("3",400, true));
		kamery.add(new Camera("4",1000, true));
		kamery.add(new Camera("5",700, true));
		kamery.add(new Camera("6",600, false));
		for(Object camera:kamery.parallelStream().filter(c->c.getDostepny() && c.getCena()>=500).toArray()){
			System.out.println(camera);
		}
			
		
		

	}

}
