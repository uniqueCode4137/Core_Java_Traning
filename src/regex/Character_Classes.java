package regex;

public class Character_Classes {

	public static void main(String[] args) {
		

		/*
		 * 1. \d matches a single digit character.
		 * 2. \w matches a single word character.
		 * 3. \s matches a single white space character.
		 * 4. \D matches a single non-digit character.
		 * 5. \W matches a single non-digit and non-word character.
		 */
		
		String patt = "\\w{2,6}\\W{2}";
		
		String str1 = "rtYUIOY*(";
		 
		System.out.println(str1.matches(patt));
	}

}
