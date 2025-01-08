package codingpractice;

import java.util.ArrayList;
import java.util.List;

public class Lshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==a.length-1 || j==0) {
					System.out.print(a[i][j]+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		
		}
		List<Integer> lshape=new ArrayList<>();
		for(int m=0;m<a.length;m++) {
			lshape.add(a[m][0]);
		}
		for(int n=1;n<a[0].length;n++) {
			lshape.add(a[a.length-1][n]);
		}
		System.out.println(lshape);

	}

}
