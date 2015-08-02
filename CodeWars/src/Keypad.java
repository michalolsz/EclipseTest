import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Keypad {
  public static int presses(String phrase) {
	String[] przyciski={"1",   "abc2",  "def3",
          "ghi4",  "jkl5",  "mno6",
          "pqrs7", "tuv8", "wxyz9",
            "*",   " 0",    "#"  };
	int ile=0;
	for(int i=0;i<phrase.length();i++){
		for(int j=0;j<przyciski.length;j++){
			int a=przyciski[j].indexOf(phrase.toLowerCase().charAt(i));
			if(a!=-1) ile+=a+1;
		}
		
	}
    return ile;
  }

	public static void main(String[] args) {
		System.out.println(Keypad.presses("HOW R U"));

	}

}
