package codingpractice;

import java.util.List;
import java.util.stream.Collectors;

public class SecondDigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = List.of(312, 314, 123, 678, 143, 812);
		li.stream().filter(n -> secDigOne(n)).forEach(System.out::println);
		List<Integer> sec=li.stream().filter(s->s.toString().substring(1,2).contains("1")).collect(Collectors.toList());
  System.out.println(sec);
	}

	private static boolean secDigOne(Integer n) {
		// TODO Auto-generated method stub
		if (n < 10) {
			return false;
		}
		while (n >= 100) {
			n = n / 10;
		}
		return n % 10 == 1;
	}

}
