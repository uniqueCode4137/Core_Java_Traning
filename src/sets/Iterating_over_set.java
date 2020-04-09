package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Iterating_over_set {

	public static void main(String[] args) {
		
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		
		set1.add(100);
		set1.add(200);
		set1.add(300);
		set1.add(400);
		set1.add(500);
		set1.add(600);
		set1.add(700);
		
		System.out.println("-------------------");
		
		for( int x: set1 ) {
			System.out.println(x);
		}

		var set2 = new TreeSet<String>();
		
		set2.add("sun");
		set2.add("mon");
		set2.add("tue");
		set2.add("wed");
		set2.add("thu");
		
		Iterator it1 = set2.iterator();
		
		while( it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
