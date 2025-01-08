package codingpractice;

import java.util.Arrays;
import java.util.List;

public class Swap2ValuesAsSet {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(12, 56, 45, 57, 23, 68);
		for (int i = 0; i < li.size(); i = i + 2) {
			int temp = li.get(i);
			li.set(i, li.get(i + 1));
			li.set(i + 1, temp);
		}

		System.out.println(li);
	}

}
