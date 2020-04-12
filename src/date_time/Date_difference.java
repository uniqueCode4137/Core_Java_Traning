package date_time;

import java.time.LocalDate;
import java.time.Period;

public class Date_difference {

	public static void main(String[] args) {
		

		LocalDate d1 = LocalDate.of(1947, 8, 15);
		
		Period p = Period.between(d1, LocalDate.now());
		
		System.out.println("The difference is "+ p.getYears() + " Years " + p.getMonths() + "months and "+ p.getDays() + " days" );

		System.out.println(p.toTotalMonths());
	}

}
