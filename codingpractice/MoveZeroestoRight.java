package codingpractice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZeroestoRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=List.of(1,0,-3,0,5,-2,0,8,0,-4);
		List<Integer> moved=Stream.concat(li.stream().filter(n->n!=0), li.stream().filter(n->n==0)).collect(Collectors.toList());

		System.out.println(moved);
	}

}
