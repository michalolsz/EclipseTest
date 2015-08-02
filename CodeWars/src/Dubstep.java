import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dubstep {
  public static String SongDecoder2 (String song)
  {
	  String result="";
	  List<String> lista=new ArrayList<>();
	  int i=0;
	  while(i<=song.length()-2){
		  if(song.substring(i, i+3).contains("WUB")) i+=3;
		  else{
			  int j=i+1;
			  while(!song.substring(i, j).endsWith("WUB")){
				  j++;
			  }
			  result+=(song.substring(i, j-3))+" ";
			  i+=song.substring(i, j-3).length();
		  } 
	  }
     return result.trim();
   }
  public static String SongDecoder (String song)
  {
	  String result="";
	  String[] wyrazy=song.split("WUB");
	  for(String wyraz:wyrazy){
		  if(wyraz.trim().length()>=1) result+=wyraz+" ";
	  }
	  System.out.println(result.trim());
	  return result.trim();
   }
}