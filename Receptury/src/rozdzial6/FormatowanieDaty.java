package rozdzial6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class FormatowanieDaty {

	public static void main(String[] args) {
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy/LL/dd");
		System.out.println(LocalDate.now());
		System.out.println(df.format(LocalDate.now()));
		
		System.out.println(LocalDate.parse("2014/04/01",df));
		
		System.out.println(ZonedDateTime.now());
		DateTimeFormatter nTZ=DateTimeFormatter.ofPattern("d MMMM yyyy h:mm");
		System.out.println(ZonedDateTime.now().format(nTZ));
		
		System.out.printf("Jesli u nas jest %s, to w Vancouver jest %s%n",LocalDateTime.now(),LocalDateTime.now().atZone(ZoneId.of("Canada/Pacific")));

	}

}
