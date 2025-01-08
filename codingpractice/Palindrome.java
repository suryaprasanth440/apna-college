package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=Arrays.asList(1,2,3,4,3,2,1);
		List<Integer> temp=new ArrayList<>();
		for(int i=li.size()-1;i>=0;i--) {
			temp.add(li.get(i));
		}
		System.out.println(temp);
		int count=0;
		for(int j=0;j<li.size();j++) {
			if(temp.get(j)!=li.get(j)) {
				count++;
			}
		}
		String palin=count==0?"Palindrome":"not a palindrome";
		System.out.println(palin);

	}

}
