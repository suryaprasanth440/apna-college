package codingpractice;

import java.util.Arrays;
import java.util.List;

public class ValuesStartsWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(10,25,15,98,76,56,14,13);
		li.stream().filter(n->n.toString().startsWith("1")).forEach(System.out::println);

	}

}
