package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLeftSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		List<Integer> l=new ArrayList<>(Arrays.asList(arr));
		
			int k = 3;
			k=k%l.size();
			
			List<Integer> temp=new ArrayList<>(l.subList(0, l.size()-k-1));
			System.out.println(temp);
			for(int i=0;i<k;i++) {
				l.remove(0);
			}
			l.addAll(l.size(),temp);
			System.out.println(l);

	}

}
