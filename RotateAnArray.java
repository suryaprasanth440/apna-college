import java.util.Arrays;

public class RotateAnArray {
    // Function to rotate the array by k positions
    public static void rotate(int[] nums, int k) {
        // In case the number of rotations exceeds array length
        k = k % nums.length;
        
        // Reverse the whole array
        reverse(nums, 0, nums.length - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }
    
    // Function to reverse elements in an array from index start to end
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        rotate(arr, k);
        
        System.out.println("Array after rotating by " + k + " positions: " + Arrays.toString(arr));
    }
}
