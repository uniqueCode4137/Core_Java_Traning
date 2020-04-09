package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Hash_Set {

	public static void main(String[] args) {
		
		/*
		 * set is a collection that cannot contain duplicate elements.
		 * HashSet does not maintain insertion order
		 * No positional access of element
		 * Basic method,: add,remove,clear,contain,size
		 * Union and insertion of set
		 * convert set to list
		 */
		
		var set1 = new HashSet<Integer>();
		
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(10);
		set1.add(20);
		
		var set2 = new HashSet<Integer>();
		
		set2.add(10);
		set2.add(40);
		set2.add(50);
		set2.add(70);
		set2.add(80);
		
		//set1.addAll(set2);
		set1.retainAll(set2);
		System.out.println(set1);
		
		//set1.remove(20);
		
		var list1 = new ArrayList<>();
		list1.addAll(set1);
		
		System.out.println(set2);
		
		System.out.println(list1);
		
		
		
	}

}
