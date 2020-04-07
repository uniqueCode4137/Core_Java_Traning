package arrays;

public class Array_Of_Object {

	public static void main(String[] args) {
		
		Object [][] arr = {{"Akshay",33,5,11,'M'},
				{"shruti",30,5,7,'F'},
				{"sanket",34,5,6,'M'},
				{"john",45,6,1,'M'}
							};
		for ( Object [] x : arr ){
			for( Object y : x ){
				System.out.print(y+ " ");	
			}
			System.out.print("\n");
		}
	}

}
