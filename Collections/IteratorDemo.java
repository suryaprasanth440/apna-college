package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l=new ArrayList<>(Arrays.asList(12,45,67,89,3,56,78));
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			Integer i=(Integer)itr.next();
			if(i%2==0) {
				System.out.print(i+" ");
			}
			else {
				itr.remove();
				
			}
		}
		System.out.println(l);

	}

}
