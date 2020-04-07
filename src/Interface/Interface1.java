package Interface;

public interface Interface1 {

	static final int a = 100;
	
	void doThis();
	
	static void xyz(){
		System.out.println("static method of interface1");
	}
	default void uvw(){
		System.out.println("default method of interface1");
	}
}
