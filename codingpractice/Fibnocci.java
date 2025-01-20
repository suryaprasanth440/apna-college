package codingpractice;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=10;
		for(int i=0;i<range;i++) {
			System.out.print(fib(i)+" ");
		}

	}
	
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return fib(n-1)+fib(n-2);
	}

}
