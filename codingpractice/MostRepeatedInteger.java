package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MostRepeatedInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(10,23,34,56,78,23,56,67,78,78,23,34,56,56,78);
		List<Integer> mostRep=new ArrayList<>();
		Map<Integer,Integer> map=new LinkedHashMap<>();
		
		Map<Integer,Long> p=li.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(p);
		
		
	long maxxx=	p.entrySet().stream().map(j->j.getValue()).max((n,m)->n>m?1:n<m?-1:0).get();
	
	System.out.println(maxxx);
		for(int num:li) {
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		System.out.println(map);
		int max=0;
		int maxInt=Collections.max(map.values());
		
		
		
//		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//			if(entry.getValue()>max) {
//				max=entry.getValue();
//			}
//			
//		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			if(entry.getValue()==maxInt) {
				mostRep.add(entry.getKey());
			}
		}
		System.out.println(maxInt);
		System.out.println(mostRep);
		

	}

}
