package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Merge2UnsortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> l1=Arrays.asList(10,45,67,78,90,23);
         List<Integer> l2=List.of(89,64,34,45,23);
         List<Integer> l3=new ArrayList<>(l1);
         l3.addAll(l2);
         System.out.println(l3);
       //  Collections.sort(l3);
         l3.stream().sorted().distinct().forEach(s->System.out.print(s+" "));
	}

}
