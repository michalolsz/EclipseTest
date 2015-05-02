package rozdzial6;

import java.time.LocalDate;
import java.time.Period;

public class RoznicaPomiedzyDatami {
	public static void main(String[] args) {
		LocalDate koniecWieku=LocalDate.of(2000, 12, 31);
		LocalDate teraz=LocalDate.now();
		Period roznica=Period.between(koniecWieku, teraz);
		System.out.printf("XXI wiek trwa juz od %d lat, %d miesiacy, %d dni",roznica.getYears(),roznica.getMonths(),roznica.getDays());
	}

}
