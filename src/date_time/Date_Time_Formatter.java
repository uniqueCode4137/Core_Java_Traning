package date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatter {

	public static void main(String[] args) {
		

		String str1 = "24/08/86";
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM-dd-yyyy][MM-dd-yyyy][dd-MM-yy]");
		
		LocalDate d1 = LocalDate.parse(str1,formatter);
		
		System.out.println(d1);

	}

}
