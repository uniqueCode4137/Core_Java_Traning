package date_time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Time_add_substract {

	public static void main(String[] args) {
		

		LocalTime t1 = LocalTime.now().plus(5,ChronoUnit.MINUTES);
		
		
		System.out.println(t1);
		
	}

}
