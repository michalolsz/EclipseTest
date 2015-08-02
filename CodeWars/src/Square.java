
public class Square {    
    public static boolean isSquare(int n) {   
      int m=(int) Math.sqrt(n);
      System.out.println(m);
      if((m*m)==n) return true;
       return false;
    }


	public static void main(String[] args) {
		System.out.println(Square.isSquare(5));

	}

}
