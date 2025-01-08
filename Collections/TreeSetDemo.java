package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String a=o1.toString();
		String b=o2.toString();
		return -a.compareTo(b);
	}
	
	
}

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator() );
		t.add("surya");
		t.add("divya");
		t.add("dasa");
		t.add("gadss");
		t.add("divya");
		t.add(new StringBuilder("hi"));
		t.add(new StringBuffer("hlo"));
		//Collections.sort(t,(a,b)->(a>b)?-1:a<b?1:0);
		System.out.println(t);
		

	}

}
