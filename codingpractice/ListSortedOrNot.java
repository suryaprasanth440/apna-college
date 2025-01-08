package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(45,91,67,78,92,126);
		List<Integer> asc=Arrays.asList(12,34,56,78,90,112);
		List<Integer> desc=Arrays.asList(90,78,56,44,32,100 );
		List<Integer> check=new ArrayList<>(li);
		Collections.sort(li);
		//System.out.println(li.equals(check));
		
		if(li.equals(check)) {
			System.out.println("given list is sorted");
		}
		else {
			System.out.println("given list is not sorted");
		}
		System.out.println("Is ascending list sorted:"+isSortedAscending(asc));
		System.out.println("Is descending list sorted:"+isSortedDescending(desc));

	}

	private static boolean isSortedAscending(List<Integer> li) {
		// TODO Auto-generated method stub
		if(li==null || li.size()<2) {
			return true;
		}
		for(int i=0;i<li.size()-1;i++) {
			if(li.get(i)>li.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	private static boolean isSortedDescending(List<Integer> li) {
		// TODO Auto-generated method stub
		if(li==null || li.size()<2) {
			return true;
		}
		for(int i=0;i<li.size()-1;i++) {
			if(li.get(i)<li.get(i+1)) {
				return false;
			}
		}
		return true;
	}

}
