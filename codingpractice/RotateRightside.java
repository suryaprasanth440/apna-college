package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateRightside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
	List<Integer> l=new ArrayList<>(Arrays.asList(arr));
	
		int k = 3;
		rotate(arr, k);
		System.out.println(Arrays.toString(arr));
		
	//	Collections.rotate(l,k);
	//	System.out.println(l);
		
		List<Integer> temp=new ArrayList<>(l.subList(l.size()-k,l.size() ));
		System.out.println(temp);
		
		for(int i=0;i<k;i++) {
			l.remove(l.size()-1);
		}
		
		l.addAll(0, temp);
		System.out.println(l );

	}

	private static void rotate(Integer[] arr, int k) {
		// TODO Auto-generated method stub
		k = k % arr.length;
		reverse(arr, 0, arr.length - 1);  //{7,6,5,4,3,2,1}
		reverse(arr, 0, k - 1); // {5,6,7,4,3,2,1}
		reverse(arr, k, arr.length - 1); //{5,6,7,1,2,3,4}
	}

	private static void reverse(Integer[] arr, int start, int end) {
		// TODO Auto-generated method stub
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

}
