package Special_Class;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter a string");
		String str1 = s1.nextLine();
		int num1 = s1.nextInt();
		String temp = "";
		 for ( int i = 0; i <= str1.length()-1; i++)
		 {
			 temp = str1.charAt(i)+temp;
			 
		 }
		 System.out.println("Reverse string is "+temp);
	}

}
