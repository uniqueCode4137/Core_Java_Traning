package oops_concepts;

public class Bank_Account {

	private long acno;
	private String acName;
	private double acBalance;

	public void deposit( double amt){
		if( amt > 0){
			acBalance = acBalance+amt;
			System.out.println("Successfully deposited $"+amt);
		}else{
			System.out.println("can not deposited $"+amt);
		}
	}
	
	public void withdral( double amt){
		if( amt > 0){
			acBalance = acBalance-amt;
			System.out.println("Successfully withdral $"+amt);
		}else{
			System.out.println("can not withdral $"+amt);
		}
	}
	public void displayCurrentBalance(){
		System.out.println("current balance is $"+acBalance);
	}
	
	public Bank_Account( long acno, String acName, double acBalance ){
		this.acBalance = acBalance;
		this.acName = acName;
		this.acno = acno;
	}
}
