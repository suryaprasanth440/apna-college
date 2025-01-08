import java.util.Arrays;

public class AnagramChecker {
	
	public static boolean anagram(String s1,String s2) {
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="listen";
		String str2="silunt";
		
		System.out.println(anagram(str1,str2));

	}

}
