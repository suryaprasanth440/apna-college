package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondandThirdLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {5, 9, 2,7,21, 2, 8, 21, 29};
		Integer[] numbs = {5, 9, 2,7,21, 2, 8, 21, 29};
		
		List<Integer> li=new ArrayList<>(Arrays.asList(numbs));
		   int firstHighest = findNthHighest(numbers, 1);
	        System.out.println("First Highest: " + firstHighest);
	        
	     // Find the 2nd highest number
	        int secondHighest = findNthHighest(numbers, 2);
	        System.out.println("Second Highest: " + secondHighest);
	        
	     // Find the 3rd highest number
	        int thirdHighest = findNthHighest(numbers, 3);
	        System.out.println("Third Highest: " + thirdHighest);
	        
	     // Find the 3rd lowest number
	        int thirdLowest = findNthLowest(numbers, 3);
	        System.out.println("Third Lowest: " + thirdLowest);
	        int k=3;
	    	int kthLargest=li.stream().sorted((n,m)->m-n).distinct().skip(k-1).findFirst().get();
	    	System.out.println("kthLargest:"+kthLargest);
	    	int kthLowest=li.stream().sorted((n,m)->n-m).distinct().skip(k-1).findFirst().get();
	    	System.out.println("kthlowest:"+kthLowest);


	}
	
	public static int findNthHighest(int[] nums,int n) {
		Set<Integer> unique=new HashSet<>();
		for(int nu:nums) {
			unique.add(nu);
		}
		Integer[] sorted=unique.toArray(new Integer[0]);
		Arrays.sort(sorted,(a,b)->b-a);
		return (n<=sorted.length)?sorted[n-1]:Integer.MIN_VALUE;
	}
	
	public static int findNthLowest(int[] nums,int n) {
		Set<Integer> unique=new HashSet<>();
		for(int nu:nums) {
			unique.add(nu);
		}
		Integer[] sorted=unique.toArray(new Integer[0]);
		Arrays.sort(sorted);
		return (n<=sorted.length)?sorted[n-1]:Integer.MIN_VALUE;
	}

}
