import java.util.Arrays;

public class Kthlargest {
	
	public static int kthLargest(int[] num, int k) {
		
		Arrays.sort(num);
		return num[num.length-k];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= {1,2,4,67,7,64,32,23};
		
		System.out.println(kthLargest(n,4));

	}

}
