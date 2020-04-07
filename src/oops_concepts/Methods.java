package oops_concepts;

public class Methods {

	public static void main(String[] args) {
	
		Methods m = new Methods();
		
		m.methode();
		m.addition(300, 400);
		int x = m.multiply(100, 100);
		System.out.println(x);
	}

	public void methode(){
		System.out.println("Do this executed");
	}
	
	public void addition( int num1, int num2 ){
		System.out.println(num1+num2);
	}
	
	public int multiply( int num1, int num2 ){
		
		int result = num1 * num2;
		return result;
	}
}
