package rozdzial5;

import javax.management.InstanceAlreadyExistsException;

public class Parsowanie {
		private static Number NAN=new Double(Double.NaN);
		public static Number process(String s){
			if(s.matches("[+-]*\\d*\\.\\d+[dDeEfF]*")){
				try{
					double dValue=Double.parseDouble(s);
					return new Double(dValue);	
				}catch(NumberFormatException e){
					System.out.println("Nieprawidlowa liczba zmiennoprzecinkowa");
					return NAN;
				}
			}
			else{
				try{
					int iValue=Integer.parseInt(s);
					return new Integer(iValue);
					
				}catch(NumberFormatException e){
					System.out.println("Nieprawidlowa liczba zmiennoprzecinkowa");
					return NAN;
				}
			}
		}

	public static void main(String[] args) {
		String s="3.0";
		System.out.println(process(s).toString());
		System.out.println(process(s) instanceof Double);
		System.out.println(process(s) instanceof Integer);

	}

}
