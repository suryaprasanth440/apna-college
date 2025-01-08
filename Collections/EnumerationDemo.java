package Collections;

import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v=new Vector();
		for(int i=1;i<15;i++) {
		v.addElement(i);
		}
		System.out.println(v);
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			Integer I=(Integer) e.nextElement();
			if(I%3==0) {
				System.out.print(I+" ");
			}
		}
		
		System.out.println(v);
		
	}

}
