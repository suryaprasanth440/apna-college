
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="I am working at cognizant";
		String reverse="";
		String[] strArr=s.split(" ");
		String wordreverse="";
		for(String st:strArr) {
			wordreverse+=new StringBuilder(st).reverse().append(" ");
		}
		
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder(s);
		String rev=sb.reverse().toString();
		System.out.println(rev);
		
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}

		System.out.println(reverse);
		System.out.println(wordreverse);
	}

}
