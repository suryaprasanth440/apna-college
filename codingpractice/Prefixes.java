package codingpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prefixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"follow","following","follower","followers"};
	    List<String> li=new ArrayList<>(Arrays.asList(s));
	    Collections.sort(li);
	    System.out.println(li);
	    String first=li.getFirst();
	    String last=li.getLast();
	    String prefix="";
	    for(int i=0;i<first.length();i++) {
	    	if(first.charAt(i)==last.charAt(i)) {
	    		prefix+=first.charAt(i);
	    	}
	    }
	    
	    System.out.println(prefix);

	}

}
