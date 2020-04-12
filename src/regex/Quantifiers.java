package regex;

public class Quantifiers {

	public static void main(String[] args) {
		

		/*
		 * 1. * matches 0 or more instance or preceding character.
		 * 2. + matches 1 ore more instance of preceding character.
		 * 3. ? matches 0 or 1 instance of preceding character.
		 * 4. {n} matches exactly 'n' instance of preceding character.
		 * 5. {n,m} matches minimum n or maximum m instance of preceding character.
		 * 6. {n,} matches minimum n or more instance of preceding character.
		 */
		
		 String patt = "ab(xyz){2,}";
		 
		 String str1 = "abxyzxyzxyzxyzxyzxyz";
		 
		 System.out.println(str1.matches(patt));
		 
		 
	}

}
