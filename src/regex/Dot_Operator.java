package regex;

public class Dot_Operator {

	public static void main(String[] args) {

		/*
		 * (Dot) '.' - Matches any single character
		 */
		
		String patt = "ABC.";
		
		String str1 = "ABC9";
		
		String patt1 = "ABC+";
		
		String str2 = "ABC65rftyughjikn97t8iyughjk";
		
		
		
		System.out.println(str2.matches(patt1));
	}

}
