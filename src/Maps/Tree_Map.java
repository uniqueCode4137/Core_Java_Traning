package Maps;

import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {
		

		var map = new TreeMap<Character, Integer>();
		
		map.put('d', 1000);
		map.put('a',2000 );
		map.put('c', 3000);
		map.put('b',4000 );

		// System.out.println(map);
		 //map.put('a', 6000);
		//replace('a', 6000);
		
		//System.out.println(map.firstEntry());
		//System.out.println(map.lastEntry());
		//System.out.println(map.firstKey());
		//System.out.println(map.lastKey());
		System.out.println(map.pollFirstEntry());
		System.out.println(map.pollLastEntry());
		 System.out.println(map.containsValue(3000));
	}

}
