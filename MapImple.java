import java.util.HashMap;
import java.util.Map;

public class MapImple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map1=new HashMap<>();
		map1.put(1, 5);
		map1.put(2, 9);
		map1.put(3,8);
		Map<Integer,Integer> map2=new HashMap<>();
		map2.put(1, 6);
		map2.put(2, 10);
		map2.put(4, 13);
		Map<Integer,Integer> map3=new HashMap<>();
		for(Integer entry1:map1.keySet()){
			if(map2.containsKey(entry1)) {
				map3.put(entry1, map1.get(entry1)+map2.get(entry1));
			}
			else {
				map3.put(entry1, map1.get(entry1));
			}
			
			
		}
		
		for(Integer entry2:map2.keySet()){
			if(!map1.containsKey(entry2)) {
				map3.put(entry2, map2.get(entry2));
			}
			
			
			
		}
		
		System.out.println(map3);
		

	}

}
