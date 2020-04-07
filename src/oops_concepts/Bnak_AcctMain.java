package oops_concepts;

public class Bnak_AcctMain {

	public static void main(String[] args) {
	
		Bank_Account b1 = new Bank_Account(12345, "xyz", 1888888);
		b1.displayCurrentBalance();
		b1.withdral(2000);
		b1.displayCurrentBalance();
		b1.deposit(-2000);
		b1.displayCurrentBalance();
		b1.deposit(5000);
		b1.displayCurrentBalance();
	}

}
