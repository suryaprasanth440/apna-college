package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecondDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(213,519,1000,578,812,7891,61);
		
		List<Integer> secone=li.stream().filter(e->secDigOne(e)).collect(Collectors.toList());
		System.out.println(secone);

	}
	
	public static boolean secDigOne(int nums) {
		if(nums<10) {
			return false;
		}
		while(nums>=100) {
			nums/=10;
		}
		return nums%10==1;
	}

}
