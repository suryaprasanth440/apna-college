package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, List<Integer>> map = new HashMap<> ();
		// Populate the map with keys and lists of values
		map.put(1,Arrays.asList(23,67,89,34,22));
		map.put(2, Arrays.asList(13,62,18,41,22));
		map.put (3, Arrays.asList(12,16,8,14));
		Map<Integer,List<Integer>> updated=new HashMap<>();
		
		System.out.println(map);
		
		for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()) {
			List<Integer> li=entry.getValue();
			List<Integer> even=new ArrayList<>();
			for(Integer n:li) {
				if(n%2==0) {
					even.add(n);
				}
			}
			updated.put(entry.getKey(), even);
		}
		
		
		System.out.println(updated);

	}

}
