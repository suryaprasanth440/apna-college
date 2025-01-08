package codingpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List<String> li=Arrays.asList("madam","malayalam","divya","hi","goat");
         List<String> palindromes= li.stream().filter(st->new StringBuilder(st).reverse().toString().equalsIgnoreCase(st)).collect(Collectors.toList());
	    System.out.println(palindromes);
	    System.out.println("Palindromes count is: "+palindromes.size());
	    li.stream().filter(re->checkReverse(re).equalsIgnoreCase(re)).forEach(System.out::println);
	}
	
	public static String checkReverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev+=s.charAt(i);
		}
		return rev;
	}

}
