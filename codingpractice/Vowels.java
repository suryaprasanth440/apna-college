package codingpractice;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SEkharamahanti SuryOa Prasanth";
		String s1="aeiouAEIOU";
		Set<Character> set=Set.of('a','e','i','o','u','A','E','I','O','U');
		int count =0;
		
		for(char ch:str.toCharArray()) {
			if(s1.contains(String.valueOf(ch))) {
				count++;
			}
		}
		System.out.println("total vowels present are: "+count);
		Map<Character,Long> map=str.chars().mapToObj(c->(char)c).filter(set::contains).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		//Map<Character,Long> map=str.chars().mapToObj(c->(char)c).filter(set::contains).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(map);
	}

}
