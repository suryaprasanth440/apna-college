package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(1,2,3,3,2,1);
		List<Integer> nu=new ArrayList<>();
		for(int i=li.size()-1;i>=0;i--) {
			nu.add(li.get(i));
		}
		System.out.println(nu);
		int count=0;
		for(int j=0;j<li.size();j++) {
			if(li.get(j)!=nu.get(j)) {
				count++;
			}
		}
		System.out.println(count);
		if(count==0) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}

}
