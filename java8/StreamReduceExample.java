package java8;
import java.util.*;
public class StreamReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l=Arrays.asList(1,3,5,6,7,8);
		Integer mul=l.stream().reduce(0,(a,b)->a+b);
		//a=1 b=1 result=1 is returned
		//a=1(result from previous) b=3 result=3 is returned
		//a=3 b=5 result=15 and so on...
		System.out.println("multiplication: "+mul);
		
		
		
	}

}
