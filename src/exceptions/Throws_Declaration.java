package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_Declaration {

	public static void main(String[] args) throws FileNotFoundException {
		

		FileInputStream x = new FileInputStream("User/md/Downloads/abc.exe");

	}

}
