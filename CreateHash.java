package hashmap;

import java.util.*;
public class CreateHash {
	
	public static void main(String args[]) {
		
		HashMap<Integer,String> map=new HashMap<>();
		
		map.put(1, "simon");
		map.put(2, "shan");
		map.put(3, "stebin");
		map.put(4, "mohammed");
		
		map.put(5, "john");
		
		for(Integer key:map.keySet()) {
			System.out.println(key+"=>"+map.get(key));
		}
	}

}
