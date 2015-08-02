
public class Circle {
  public static double area(double radius) {
	 if(Math.abs(radius-0)<1.0E-15) throw new IllegalArgumentException();
     return Math.round(Math.PI*(radius*radius) * 100.0) / 100.0;

  }
  public static void main(String[] args) {
		
		System.out.println(Circle.area(43.2673));

	}
}
