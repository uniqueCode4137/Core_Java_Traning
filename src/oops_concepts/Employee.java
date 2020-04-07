package oops_concepts;

public class Employee {

	
	String empName = "ABC";
	int empId = 100;
	int empSalary = 100;
	
	public void displayEmployeeBonus(){
		
		System.out.println("Employee "+empName+" gets the bonus of "+(empSalary*0.20));
	}
	
}
