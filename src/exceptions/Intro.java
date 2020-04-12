package exceptions;

public class Intro {

	public static void main(String[] args) {
		

		/*
		 * 1. What is an exception ?
		 *    Exceptions are event which occurs during the excution of programs that disrupts the normal 
		 *    flow of the application.
		 * 2. What is an exception object ?
		 *    Exception object is an instance of an exception class. it gets created and handled over the java runtime 
		 *    when an exceptional event occurs.
		 *       
		 */
		
		String x = null;
		
		System.out.println( 100/0 );
		System.out.println( x.length() );
		System.out.println( "Hello");
		
		
	}

}
