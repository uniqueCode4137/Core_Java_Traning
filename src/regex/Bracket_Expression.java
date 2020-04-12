package regex;

public class Bracket_Expression {

	public static void main(String[] args) {
		

		/*
		 * 1. Adding literals in bracket [aeiou]
		 * 2. Adding ranges in brackets [A-z0-9]
		 * uSAGE OF '^' IN BRACKETS [^a-z]
		 */
		
		String patt = "[A-Za-z0-9_] {3}at";//[afg]
		
		String str1 = "ABtat";
		
		System.out.println(str1.matches(patt));
	}

}
