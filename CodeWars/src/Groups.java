import java.util.Stack;


public class Groups{

  public static boolean groupCheck(String s){
	  Stack<Character> stos=new Stack<>();
	  for(int i=0;i<s.length();i++){
		  switch (s.charAt(i)){
		  case '(': stos.push('('); break;
		  case ')': if(stos.peek()=='(') stos.pop();
		  			else return false;
		  				break;
		  case '{': stos.push('{'); break;
		  case '}': if(stos.peek()=='{') stos.pop();
					else return false;
					break;
		  case '[': stos.push('['); break;
		  case ']': if(stos.peek()=='[') stos.pop();
					else return false;
					break;
		  };  
	  }
	  if(stos.empty()) return true;
	  else return false;
  }
  


	public static void main(String[] args) {
		System.out.println(groupCheck("(())("));

	}

}
