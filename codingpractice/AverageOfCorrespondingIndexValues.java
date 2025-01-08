package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AverageOfCorrespondingIndexValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> li = Arrays.asList(Arrays.asList(10, 20, 30), Arrays.asList(40, 50, 60),
				Arrays.asList(70, 80, 90));
		System.out.println(li);
		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		List<Integer> avg=new ArrayList<>();
		System.out.println(Arrays.deepToString(arr));
		
		int size = li.get(0).size();
		int[] sum = new int[size];
		for(List<Integer> l:li) {
			for(int i=0;i<size;i++) {
				sum[i]+=l.get(i);
			}
		}
		System.out.println(Arrays.toString(sum));
		for(int m:sum) {
			avg.add(m/size);
		}
		System.out.println("average is:"+avg);
		
		//when there is uneven list
		List<List<Integer>> input=new ArrayList<>();
		input.add(Arrays.asList(10,20,30,40));
		input.add(Arrays.asList(70,80));
		input.add(Arrays.asList(50,60,90));
		List<Integer> res=new ArrayList<>();
		int maxListSize=input.stream().mapToInt(List::size).max().orElse(0);
		System.out.println(maxListSize);
		for(int i=0;i<maxListSize;i++) {
			res.add(0);
		}
		
		for(List<Integer> in:input) {
			for(int i=0;i<in.size();i++) {
				res.set(i, res.get(i)+in.get(i));
			
			}
			
		}
		
		System.out.println("sum of un even list:"+res);
		
		}
}