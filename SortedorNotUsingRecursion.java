
public class SortedorNotUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,12,4,6,7,8,9};
		if(sorted(arr,0)) {
			System.out.println("the given array is in sorting order");
		}
		else {
			System.out.println("the given array is not in sorting order");
		}
		

	}
	
	public static boolean sorted(int[] arr, int index) {
		if(arr.length==0 || index==arr.length-1) {
			return true;
		}
		if(arr[index]>arr[index+1]) {
			return false;
		}
		
		return sorted(arr,index+1);
		
	}

}
