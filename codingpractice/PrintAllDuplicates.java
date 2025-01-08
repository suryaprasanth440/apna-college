package codingpractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(10,15,8,49,25,98,98,32,15);
		List<Integer> dupList=li.stream().filter(n->li.indexOf(n)!=li.lastIndexOf(n)).collect(Collectors.toList());
		System.out.println(dupList);

		Set<Integer> st=new HashSet<>();
		Set<Integer> dups=new HashSet<>();
		dups=li.stream().filter(s->!st.add(s)).collect(Collectors.toSet());
		System.out.println(dups);
	}

}
