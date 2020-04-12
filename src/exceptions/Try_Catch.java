package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try_Catch {

	public static void main(String[] args) {
		

		abc();
	}

	public static void abc() {
		try {
				FileInputStream x = 
				new FileInputStream("User/md/Downloads/abc.exe");
		}catch( FileNotFoundException e){
					System.out.println(e.getMessage());
					System.out.println(e.toString());
					e.printStackTrace();
		}catch( IOException e2) {
			System.out.println(e2.getMessage());
		}catch( Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

}
