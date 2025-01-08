package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;

public class TreesetImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set t=new TreeSet<>(Collections.reverseOrder());
		t.add(20);
		t.add(10);
		t.add(15);
		t.add(45);
		t.add(60);
		t.add(12);
		System.out.println(t);

	}

}

class MyComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer i1=(Integer) o1;
		Integer i2=(Integer) o2;
		if(i1>i2) {
			return -1;
		}
		else if(i1<i2) {
			return 1;
		}
		return 0;
	}
	
}
