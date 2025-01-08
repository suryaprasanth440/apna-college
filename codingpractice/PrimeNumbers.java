package codingpractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.rangeClosed(1, 100).filter(n->isPrime(n)).forEach(s->System.out.print(s+" "));

	}
	
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			return true;
		}
		return false;
	}

}
