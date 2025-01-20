package codingpractice;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		System.out.println(sum(number));

	}

	public static int sum(int num) {
		if(num==0) {
			return 0;
		}
		return (num%10)+sum(num/10);
	}
}
