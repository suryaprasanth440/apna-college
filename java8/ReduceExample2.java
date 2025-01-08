package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=new ArrayList<>(Arrays.asList(12,4,5,34,56,12));
		
		Optional<Student> op=StudentDatabase.getAllStudents().stream()
				.reduce((s1,s2)->s1.getGpa()>s2.getGpa()?s1:s2);
		
		Optional<Integer> op1=l.stream().reduce((t1,t2)->t1>t2?t1:t2);
		
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		
		if(op1.isPresent()) {
			System.out.println(op1);
		}
		else {
			System.out.println("list is empty");
		}
		
		//System.out.println(op1.get());

	}

}
