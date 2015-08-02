import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DirReduction {
    public static String[] dirReduc(String[] arr) {
    	int zmiany=0;
    	List<String> lista=new ArrayList<>();
    	for(int i=0;i<arr.length;i++){
    		switch (arr[i]){
    			case "NORTH":
    				if(i==arr.length-1 || !arr[i+1].equals("SOUTH")){
    					lista.add(arr[i]);
    				}
    				else{
    					zmiany++;
    	    			i++;
    				}
    				break;
    			case "SOUTH":
    				if(i==arr.length-1 || !arr[i+1].equals("NORTH")){
    					lista.add(arr[i]);
    				}
    				else{
    					zmiany++;
    	    			i++;
    				}
    				break;
    			case "EAST":
    				if(i==arr.length-1 || !arr[i+1].equals("WEST")){
    					lista.add(arr[i]);
    				}
    				else{
    					zmiany++;
    	    			i++;
    				}
    				break;
    			case "WEST":	
    				if(i==arr.length-1 || !arr[i+1].equals("EAST")){
    					lista.add(arr[i]);
    				}
    				else{
    					zmiany++;
    	    			i++;
    				}
    				break;
    		
    		}    				
    	}
    	if(zmiany>0){
    		String[] nowa=new String[lista.size()];	
    		nowa=lista.toArray(new String[0]); 
    		return dirReduc(nowa);
    	}
        return arr;
    }


	public static void main(String[] args) {
		System.out.println(Arrays.toString(DirReduction.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));

	}

}
