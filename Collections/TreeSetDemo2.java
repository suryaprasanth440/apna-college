package Collections;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String a=o1.toString();
		String b=o2.toString();
		int l1=a.length();
		int l2=b.length();
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2) {
			return 1;
		}
		return a.compareTo(b);	}
	
	
}

public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet t=new TreeSet(new MyComparator1() );
		t.add("A");
		t.add("AAA");
		t.add("ABC");
		t.add("XX");
		t.add("CCCC");
		t.add(new StringBuilder("AX"));
		t.add(new StringBuffer("AM"));
		//Collections.sort(t,(a,b)->(a>b)?-1:a<b?1:0);
		System.out.println(t);
		

	}

}
