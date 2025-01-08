package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new LinkedHashMap<>();
		map.put(104, "divya");
		map.put(105, "prasanth");
		map.put(107, "dasa");
		map.put(106,"divya dasa");
		map.put(100, "divya");
		map.put(101, "prasanth");
		map.put(103, "dasa");
		map.put(100,"divya dasa");
	
		System.out.println(map.put(100,"divya dasa"));
		System.out.println(map);
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}

	}

}
