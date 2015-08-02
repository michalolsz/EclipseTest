import java.text.DecimalFormat;


public class Converter {
  public static float mpgToKPM(final float mpg) {
      double result=mpg*1.609344;
      result=result/4.54609188;    
      return Math.round(result*100)/100;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
