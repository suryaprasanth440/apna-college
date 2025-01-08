package codingpractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PancardChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="JLRPS1875N";
		if(isValidPan(str)) {
			System.out.println("given one is a valid pan number");
		}
		else {
			System.out.println("not a valid pan number");
		}

	}

	private static boolean isValidPan(String str) {
		// TODO Auto-generated method stub
		String regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
	    Pattern p=Pattern.compile(regex);
	    if(str==null) {
	    	return false;
	    }
	    Matcher m=p.matcher(str);
	    return m.matches();
	}

}
