package Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "aabbbcccc";
		//char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		String sb="";
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			sb=sb+entry.getKey().toString()+String.valueOf(entry.getValue());
		}

		System.out.println(sb);
		
		
		Integer i [] ={1,2,3,4,4,5,5};
		List<Integer> li=new ArrayList<>();
		Set<Integer> set=new TreeSet<>();
		for(int n:i) {
			li.add(n);
		}
		int secLargest=li.stream().sorted((m,t)->t-m).distinct().skip(1).findFirst().get();
		System.out.println(secLargest );
	}

}
