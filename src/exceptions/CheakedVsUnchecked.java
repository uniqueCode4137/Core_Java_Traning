package exceptions;

import java.io.FileInputStream;

public class CheakedVsUnchecked {

	public static void main(String[] args) {
	

		/*
		 * Checked exceptions are compile time.
		 * 
		 * Unchecked exceptions are runtime.
		 */
		
		//FileInputStream x = new FileInputStream("User/md/Downloads/abc.exe");
		
		System.out.println(100/0);
		
		
	}

}
