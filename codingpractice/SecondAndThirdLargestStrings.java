package codingpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondAndThirdLargestStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray={"java","techie","springboot","microservices"};
		List<String> li=Arrays.asList(strArray);
		Map<String,Integer> map=li.stream().collect(Collectors.toMap(Function.identity(),String::length));
		System.out.println(map);
		
		int max=map.values().stream().max((a,b)->a-b).get();
		System.out.println(max);
		//i) Java program to find smallest string from given array
		String smallest=Arrays.stream(strArray).sorted(Comparator.comparing(String::length)).findFirst().orElse(null);
		System.out.println("smallest string:"+smallest);
		//ii) Java program to find 2nd smallest string from given array
		
		String secondsmallest=Arrays.stream(strArray).sorted(Comparator.comparing(String::length)).distinct().skip(1).findFirst().orElse(null);
		System.out.println("second smallest string:"+secondsmallest);
		//iii) Java program to find 2nd longest string from given array
		
		String secondLongest=Arrays.stream(strArray).sorted(Comparator.comparing(String::length).reversed()).distinct().skip(1).findFirst().orElse(null);
		System.out.println("second longest string:"+secondLongest);

	}

}
