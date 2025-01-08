package codingpractice;

import java.util.List;

public class FirstDigitOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = List.of(312, 314, 123, 678, 143, 812,1);
		li.stream().filter(n -> firstDigOne(n)).forEach(System.out::println);

	}

	private static boolean firstDigOne(Integer n) {
		// TODO Auto-generated method stub
		while(n>=10) {
			n=n/10;
		}
		return n%10==1;
	}

}
