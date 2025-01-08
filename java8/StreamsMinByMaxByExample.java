package java8;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

	public static Optional<Student> minBy_example(){
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	public static Optional<Student> maxBy_example(){
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("minby:"+minBy_example());
		System.out.println("max by:"+maxBy_example()); 

	}

}
