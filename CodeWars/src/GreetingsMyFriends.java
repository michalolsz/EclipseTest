
public class GreetingsMyFriends {

	public String[] greetingForAllFriends(String... friends) {
		String[] greeting;
		if(friends==null || friends.length==0) return null;
		    else {
		          greeting=new String[friends.length];
		          for(int i=0;i<friends.length;i++)
		          greeting[i]="Hello, "+friends[i];
    		}
    return greeting;
  }



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
