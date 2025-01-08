package java8;

import java.util.stream.IntStream;

public class ImperativevsDeclarativeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imperative approach
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;
		}
		System.out.println("Imperative approach:"+sum);
		
		int sum1=IntStream.rangeClosed(0, 100).sum();
		System.out.println("declarative approach:"+ sum1);

	}

}
