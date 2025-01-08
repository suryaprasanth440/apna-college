package codingpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class KthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(12,34,56,67,78,89,98,99,120);
		int k=3;
		int kthLargest=li.stream().sorted((n,m)->m-n).skip(k-1).findFirst().get();
		System.out.println(kthLargest);

	}

}
