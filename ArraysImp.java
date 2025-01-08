
public class ArraysImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=(int)(Math.random()*100);
		System.out.println(n);
		
		int[][] nums=new int[3][4];//normal array
		System.out.println(nums.length);
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				nums[i][j]=(int)(Math.random()*100);
			}
			
		}
		
		for(int ni[]:nums) {
			for(int nu:ni) {
				System.out.print(nu+" ");
			}
			System.out.println();
		}
		
		int arr[][]=new int[4][];
		arr[0]=new int[5];
		arr[1]=new int[4];
		arr[2]=new int[5];
		arr[3]=new int[4];
		for(int k=0;k<nums.length;k++) {
			for(int l=0;l<nums[k].length;l++) {
				arr[k][l]=(int)(Math.random()*100);
			}
			
		}
		
		for(int ki[]:arr) {
			for(int ku:ki) {
				System.out.print(ku+" ");
			}
			System.out.println();
		}

	}

}
