package arrays;

public class Array_Exercise {

	public static void main(String[] args) {
		

		/*
		 * reverse the array
		 */
		
		int [] arr = { 10, 20, 30, 40, 45,455,4554 };
		int j = arr.length-1;
		int temp = 0;
		for( int i = 0; i <= (arr.length-1)/2; i++ ){
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		for( int x : arr ){
			System.out.println(x);
		}
	}

}
