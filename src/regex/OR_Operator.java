package regex;

public class OR_Operator {

	public static void main(String[] args) {
		

		/*
		 * OR -Operator [|]
		 */
		
		String patt = "a(b|c|d|xyz|123)";
		
		String str1 = "acd";
		
		System.out.println(str1.matches(patt));
		
	}

}
