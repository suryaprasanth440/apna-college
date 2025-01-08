package Interview;

import java.util.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7};
		
		rotate(nums,3);
		System.out.println("Array after rotation:"+Arrays.toString(nums));

	}

	private static void rotate(int[] nums, int k) {
		// TODO Auto-generated method stub
		k=k%nums.length;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,k-1);
		reverse(nums,k,nums.length-1);
		
		
	}

	private static void reverse(int[] nums, int i, int j) {
		// TODO Auto-generated method stub
	    while(i<j) {
	    	int temp=nums[i];
	    	nums[i]=nums[j];
	    	nums[j]=temp;
            i++;
            j--;
	    }
		
	}

}
