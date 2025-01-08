package java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

	public static List<Student> filterStudents(){
		return StudentDatabase.getAllStudents().stream()
				.filter(s->s.getGender().equals("female"))
				.collect(Collectors.toList());
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(filterStudents());
		filterStudents().forEach(System.out::println);

	}

}
