package Patterns;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome";
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(i==j) {
					System.out.print(s.charAt(i)+" ");
				}
				else if(i+j==s.length()-1) {
					System.out.print(s.charAt(i)+" ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println("  ");
		}

	}

}
