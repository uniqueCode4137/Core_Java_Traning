package Lists;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator_Program1 {

	public static void main(String[] args) {
	

	var list = new LinkedList<Integer>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(null);
		list.add(400);
		list.add(null);
		
		ListIterator itr = list.listIterator();
		while(itr.hasNext()) {
		if(itr.next() == null) {
			//itr.remove();
			itr.set(0);
		}
		
		}
		System.out.println(list);
	}

}
