package java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMappingExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=StudentDatabase.getAllStudents().stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		System.out.println(names);
		
		List<List<String>> activities=StudentDatabase.getAllStudents().stream()
				.collect(Collectors.mapping(Student::getActivities, Collectors.toList()));
		
		System.out.println(activities);
	}

}
