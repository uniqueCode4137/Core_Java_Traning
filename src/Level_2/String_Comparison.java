package Level_2;

public class String_Comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 Equals
		 Compare To
		 Matches
		 */
		
		String str1 = "ABCD";
		String str2 = "aBCD";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if (str1.equals(str2)){
			System.out.println("Strings are equal");
		}else{
			System.out.println("Strings are not equal");
		}
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		
		String patt = "[A-Z],{1,}";
		System.out.println(str1.matches(str2));
		
	}

}
