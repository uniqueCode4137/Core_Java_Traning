package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Example_2 {

	public static void main(String[] args) {
		

		String str1 = "Your total cost is $2400997.9999898 after $800.878787 sale discount and $12.o9 coupon1 discount and $01.010 coupon2 discount";
		
		String patt = "\\${1}\\d{1,}\\.d{1,}";
		
		Pattern p = Pattern.compile(patt);
		
		Matcher m = p.matcher(str1);
		
		while(m.find()) {			
			System.out.println(m.group());
		}
	}

}
