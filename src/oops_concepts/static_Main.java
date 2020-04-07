package oops_concepts;

public class static_Main {

	public static void main(String[] args) {
		
		Static_Keyword sk1 = new Static_Keyword();
		
		Static_Keyword sk2 = new Static_Keyword();
		
		sk1.age = 7;
		sk1.grade = "2nd";
		Static_Keyword.name = "rob";
		sk2.age = 8;
		sk2.grade = "3nd";
		Static_Keyword.name = "shyam";
		
		sk1.displayDetails();
		sk2.displayDetails();
		Static_Keyword.doThis();
	}

}
