package codingpractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="ilovejavatechie";
      Map<Character,Integer> map=new LinkedHashMap<>();
      for(char ch:str.toCharArray()) {
    	  map.put(ch, map.getOrDefault(ch, 0)+1);
      }
      System.out.println(map);
      //first non repeat element
    System.out.println(map.entrySet().stream().filter(n-> n.getValue()==1).findFirst().get());  
    for(Map.Entry<Character, Integer> entry:map.entrySet()) {
    	if(entry.getValue()==1) {
    		System.out.println("first non repeating element:"+entry.getKey());
    		break;
    	}
    }
      //second non repeat element	
    System.out.println(map.entrySet().stream().filter(n-> n.getValue()==1).skip(1).findFirst().get());
    int count=0;
    for(Map.Entry<Character, Integer> entry:map.entrySet()) {
    	if(entry.getValue()==1) {
    		count++;
    	}
    	   if(count==2) {
    		System.out.println("second non repeating element:"+entry.getKey());
    		break;
    	   }
    	}
    }
	

}
