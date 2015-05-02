package rozdzial6;

import java.time.LocalDate;
import java.time.Period;

public class DodawanieDat {

	public static void main(String[] args) {
		System.out.printf("Za 1000dni od %s bedzie %s%n",LocalDate.now(),LocalDate.now().plus(Period.ofDays(1000)));

	}

}
