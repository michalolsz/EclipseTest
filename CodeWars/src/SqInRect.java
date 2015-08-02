import java.util.ArrayList;
import java.util.List;


public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		if(lng==wdth) return null;
		int suma=0;
		int wartosc=lng*wdth;
		List<Integer> result=new ArrayList<>();
		while(suma!=wartosc){
			if(lng>wdth) {
				result.add(wdth);
				suma+=wdth*wdth;
				lng-=wdth;
			}else{
				result.add(lng);
				wdth-=lng;
				suma+=lng*lng;
			}
				
		}
		return result;
		}


	public static void main(String[] args) {
		System.out.println(SqInRect.sqInRect(5,3));

	}

}
