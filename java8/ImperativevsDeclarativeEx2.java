package java8;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativevsDeclarativeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//remove duplicates
		List<Integer> intList=Arrays.asList(1,2,3,2,4,5,6,7,2,3,4,5,6,6,7,10);
		List<Integer> uniqueList=new ArrayList<>();
		for(Integer i:intList) {
			if(!uniqueList.contains(i)) {
				uniqueList.add(i);
			}
		}
		System.out.println("unique list:"+uniqueList);
		
		//declarative approach
		
		List<Integer> unique2=intList.stream().distinct().collect(Collectors.toList());
		
   System.out.println("unique list 2:"+unique2);
	}

}
