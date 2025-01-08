package codingpractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabbbcccc";
		Map<Character,Integer> map=new LinkedHashMap<>();
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}

		String count="";
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			count+=entry.getKey().toString()+String.valueOf(entry.getValue());
		}
		System.out.println(count);
	}

}
