import java.util.StringTokenizer;


public class MorseCodeDecoder {
    public static String decode(String morseCode) {
    	String wynik="";
    	String[] array = morseCode.split("\\s{3,}");
    	for(int i=0;i<array.length;i++){
    		StringTokenizer token=new StringTokenizer(array[i]);
    		while(token.hasMoreTokens()){
    			//wynik+=MorseCode.get(token.nextToken());
    		}
    		wynik+=" ";
    	}			
        return wynik.substring(0,wynik.length()-1);
        // your brilliant code here, remember that you can access the preloaded Morse code table through MorseCode.get(code)
    }

	public static void main(String[] args) {
		//System.out.println(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
		String slowo=".... . -.--";
		String[] array = slowo.split("\\s{3,}");
		System.out.println(array.length);
		

	}

}
