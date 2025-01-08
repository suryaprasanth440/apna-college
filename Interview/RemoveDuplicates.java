package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(23,45,67,89,12,23,45);
		List<Integer> uniqueList=new ArrayList<>();
		Set<Integer> seen=new HashSet<>();
		for(int num:li) {
			if(!seen.contains(num)) {
				uniqueList.add(num);
				seen.add(num);
			}
		}

		System.out.println("uniqueList:"+uniqueList);
		String str="SWISSIS";
		List<Character> l=new ArrayList<>();
		for(char c:str.toCharArray()) {
			l.add(c);
		}
		l.stream().filter(t->l.indexOf(t)==l.lastIndexOf(t)).forEach(System.out::println);
	  System.out.println("duplicates");
	  l.stream().filter(d->l.indexOf(d)!=l.lastIndexOf(d)).forEach(System.out::println);
	}

}
