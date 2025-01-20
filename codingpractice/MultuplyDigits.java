package codingpractice;

public class MultuplyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=12345;
		System.out.println(mul(number));

	}

	public static int mul(int num) {
		if(num==0) {
			return 1;
		}
		return (num%10)*mul(num/10);
	}
}
