package codingpractice;

import java.util.Arrays;

public class AnagramsOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="divya";
		String s2="vidya";
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("given strings are anagrams");
		}
		else {
			System.out.println("given strings are not anagrams");
		}

	}

}
