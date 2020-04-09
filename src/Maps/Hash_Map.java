package Maps;

import java.util.HashMap;

public class Hash_Map {

	public static void main(String[] args) {
		
		var map = new HashMap<String, Integer>();
		
		 	map.put("vishal", 10); 
	        map.put("sachin", 30); 
	        map.put("vaibhav", 20);
	        
	        System.out.println(map.get("sachin"));
	        System.out.println(map);
	        System.out.println(map.containsKey("sachin"));
	        
	        map.put("Akshay",20);
	        
	        //map.clear();
	        
	        var set1 = map.keySet();
	        var set2 = map.values();
	        var set3 = map.entrySet();
	        
	        System.out.println(map);
	}

}
