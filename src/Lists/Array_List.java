package Lists;

import java.util.List;
import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList <String> arr = new ArrayList<String>();
		
		arr.add("red");
		arr.add("pink");
		arr.add("yellow");
		arr.add("green");
		arr.add("white");
		arr.add("black");
		arr.add("blue");
		 //arr.remove(0);
		 //arr.remove("green");
		 //arr.clear();
		System.out.println(arr);
		
		System.out.println(arr.get(0));
		System.out.println(arr.get(3));
		arr.set(3, "pink");
		
		System.out.println(arr.get(3));
		
		System.out.println(arr.indexOf("pink"));
		System.out.println(arr.lastIndexOf("pink"));
		System.out.println(arr.contains("pink"));
		
		List<String> arr2 = arr.subList(2, 5);
		System.out.println(arr2);
		System.out.println("-------------------");
		System.out.println(arr.size());
		System.out.println(arr.isEmpty());
		
		System.out.println("List Elements "+arr);
		System.out.println("-------------------");
		for(String x : arr){
			System.out.println(x);
		}
		}

}
