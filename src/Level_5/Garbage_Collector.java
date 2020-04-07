package Level_5;

public class Garbage_Collector {

	public static void main(String[] args) {
		
		String str1 = "gkgkjhkjhkjj";
		
		for (int i = 1; i <= str1.length()-1; i++) {
			String temp = "ch" +i+ str1.charAt(i);
			
			System.out.println(str1);
		}
		
		

	}
}
