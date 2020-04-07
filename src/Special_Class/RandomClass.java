package Special_Class;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {
		
		
		Random r1 = new Random();
		
		for ( int i = 1; i <= 100; i++)
		{
			System.out.println((int)(Math.random()*40000+10000));
		}
				
	}

}
