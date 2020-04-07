package Level_2;

public class String_search {

	public static void main(String[] args) {
		
		/**
		 start with
		 ends with
		 index of
		 last index of
		 */

		String str1 = "I love java love and selenium";
		
		String str2= "Java";
		
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		
		System.out.println(str1.startsWith("I"));
		
		System.out.println(str1.endsWith("seleniume"));
		
		System.out.println(str1.indexOf("love"));
		
		System.out.println(str1.indexOf("love", 6));
		
		System.out.println(str1.lastIndexOf("love"));
	}

}
