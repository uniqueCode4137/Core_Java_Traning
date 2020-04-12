package date_time;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class date_and_substract {

	public static void main(String[] args) {
		

		LocalDate d1 = LocalDate.now().plus(10,ChronoUnit.DECADES);
		
		System.out.println(d1);
	}

}
