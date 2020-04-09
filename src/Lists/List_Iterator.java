package Lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator {

	public static void main(String[] args) {
		

		var list = new LinkedList<Double>();
		
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		list.add(1.5);
		list.add(1.6);
		
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			//System.out.println(itr.previous());
			
		}
	}

}
