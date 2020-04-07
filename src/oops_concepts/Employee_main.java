package oops_concepts;

public class Employee_main {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		
		Employee emp2 = new Employee();
		
		emp1.empName = "Rob";
		emp1.empId = 200;
		emp1.empSalary = 15442;
		
		emp1.displayEmployeeBonus();
		
		emp2.empName = "Silva";
		emp2.empId = 300;
		emp2.empSalary = 65577;
		
		emp2.displayEmployeeBonus();
	}

}
