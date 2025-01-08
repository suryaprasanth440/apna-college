package codingpractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("factorial of given number is:"+fact(num));
		System.out.println("using recursion : "+recursion(num));

	}

	private static long recursion(int num) {
		// TODO Auto-generated method stub
		if(num==0 ||num==1) {
			return 1;
		}
		return num*recursion(num-1);
	}

	private static long fact(int num) {
		// TODO Auto-generated method stub
		if(num==0) {
			return 1;
		}
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
