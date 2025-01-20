package codingpractice;

public class ReverseUsingRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="recursion";
	System.out.println(reverse(input));
		System.out.println(input.substring(1));

	}
 
	public static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1))+str.charAt(0);
	}
}
