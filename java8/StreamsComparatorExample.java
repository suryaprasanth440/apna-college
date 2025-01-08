package java8;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {
	
	public static List<Student> sortStudentsByName(){
		List<Student> studs=StudentDatabase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
		return studs;
	}
	
	public static List<Student> sortStudentsByGpaDesc(){
		List<Student> studs=StudentDatabase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
		return studs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(sortStudentsByName());
		sortStudentsByName().forEach(s->System.out.println(s));
		
		System.out.println("by Gpa desc");
		sortStudentsByGpaDesc().forEach(System.out::println);
		

	}

}
