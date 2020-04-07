package arrays;

public class Arrays {

	public static void main(String[] args) {
		
		String [] DaysOfWeek = { "mon","tue","wed","thu","fri","sat","sun" };
		
		System.out.println(DaysOfWeek.length);
		
		System.out.println(DaysOfWeek[2]);
		
		DaysOfWeek[2] = "RRR";
		
		System.out.println(DaysOfWeek[2]);
		
		for ( int i = 0; i < DaysOfWeek.length - 1; i++ ){
			System.out.println(DaysOfWeek[i]);
		}
		int [] arr1 = { 12,24,34,65,765,678,8768,9087};
		
		char [] arr2 = {'a', 'e','i'};
	}

}
