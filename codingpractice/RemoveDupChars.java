package codingpractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDupChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India is my country";
		Set<Character> set=new LinkedHashSet<>();
		for(char ch:s.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set);
		String after="";
		for(char cha:set) {
			after+=cha;
		}
		System.out.println(after);
		
		//2nd way
		String[] arr=s.split("");
		Set<String> uniqueChars=new LinkedHashSet<>(Arrays.asList(arr));
		String res=String.join("", uniqueChars);
		System.out.println(res);
		
		//3rd way

		String result=s.chars().mapToObj(c->String.valueOf((char)c)).distinct().collect(Collectors.joining());
		System.out.println(result);
		System.out.println("-----------------");
		
		//4th way
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char temp=s.charAt(i);
			if(temp!=' ') {
				if(sb.indexOf(String.valueOf(temp))==-1) {
					sb.append(temp);
				}
				
			}
			else {
				sb.append(' ');
			}
		}
		String rs=sb.toString().trim();
		System.out.println(rs);
	}

}
