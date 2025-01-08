package java8;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee(1);
		Employee e2=new Employee(1); 
		
		Map<Employee,Integer> m=new HashMap<>();
		m.put(e1, 56);
		m.put(e2, 67);
		System.out.println(m.size()+" : "+m);
		Map<Integer,Integer> m1=new HashMap<>();
		m1.put(1, 78);
		m1.put(1, 65);
		
		System.out.println(m1.size()+ ": "+m1);

	}

}
