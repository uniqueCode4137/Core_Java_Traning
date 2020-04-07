package oops_concepts;

public class Temp {

	public static void main(String[] args) {

		Cars c1 = new Cars();
		
		c1.color = "red";
		c1.make = "Bmw";
		
		c1.displayCarInfo();
		
		Cars c2 = new Cars();
		
		c2.color = "orange";
		c2.make = "Toyato";
		c2.type = "sadan";
		
		c2.displayCarInfo();
		
		Methods m1 = new Methods();
		m1.addition(1050, 22);
		m1.methode();
		int u = m1.multiply(2050,30);
		
		System.out.println(u);
		
		/*
		 * Methode Overloading
		 */
		Methode_Overloading mo = new Methode_Overloading();
		mo.addition(10.00, 20.00);
		mo.addition(20, 60);
		mo.addition(30, 76.99);
		mo.addition(90.4, 77);
		mo.addition(10, 30, 56);
		
	}

}
