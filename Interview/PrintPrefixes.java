package Interview;

import java.util.Arrays;

public class PrintPrefixes {
    public static void main(String[] args) {
        String[] s = {"follow", "following", "follower","followers"};
        System.out.println(findCommonPrefix(s));  // prints "follow"
    }

    // Method to find the common prefix
    public static String findCommonPrefix(String[] strs) {
    	Arrays.sort(strs);
    	System.out.println(Arrays.toString(strs));
    	
    	String first=strs[0];
    	String last=strs[strs.length-1];
    	String rev="";
    	
    	for(int i=0;i<first.length();i++) {
    		if(first.charAt(i)==last.charAt(i)) {
    			rev+=first.charAt(i);
    		}
    	}
    	
    	return rev;
    }
}
