package Inheritance;

public class PolyMain {

	public static void main(String[] args) {
		
		Traingle t1 = new Traingle();
		t1.setBaseAndHeight(10.0, 29.98);
		t1.CalcArea();
		Rectangle r1 = new Rectangle();
		r1.setBaseAndHeight(74.98, 87.99);
		r1.CalcArea();
		
	}

}
