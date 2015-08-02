package rozdzial6;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class ZamianaStarychDateICalendar {

	public static void main(String[] args) {
		Date test=new Date();
		System.out.println(test);
		LocalDateTime newDate=LocalDateTime.ofInstant(test.toInstant(),ZoneId.systemDefault());
		System.out.println(newDate);
		
		Calendar c=Calendar.getInstance();
		System.out.println(c);
		LocalDateTime newCal=LocalDateTime.ofInstant(c.toInstant(),ZoneId.systemDefault());
		System.out.println(newCal);
		

	}

}
