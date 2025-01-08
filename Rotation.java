import java.util.Arrays;

public class Rotation {

	
	public static void rotate(int[] nums,int k) {
		k=k%nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		
	}
	
	public static void reverse(int[] nums,int start,int end) {
		while(start<end) {
			int temp= nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
		rotate(arr,2);
		System.out.println(Arrays.toString(arr));

	}

}
