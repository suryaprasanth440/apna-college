package Interview;

import java.util.Arrays;

public class PrintSuffixes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"hello","pello","khello","tlello"};
		System.out.println(commonSuffix(str));
		

	}

	private static String commonSuffix(String[] str) {
		// TODO Auto-generated method stub
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		String first=str[0];
		String last=str[str.length-1];
		String res="";
		for(int i=1;i<first.length();i++) {
			if(first.charAt(first.length()-i)==last.charAt(last.length()-i)) {
				res=first.charAt(first.length()-i)+res;
			}
		}
		
		return res;
	}

}
