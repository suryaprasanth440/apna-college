package java8;

import java.util.stream.Collectors;

public class StreamsJoiningExample {
	
	public static String joining_1() {
		return StudentDatabase.getAllStudents()
				.stream().map(Student::getName)
				.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		return StudentDatabase.getAllStudents()
				.stream().map(Student::getName)
				.collect(Collectors.joining(" : "));
	} 
	public static String joining_3() {
		return StudentDatabase.getAllStudents()
				.stream().map(Student::getName)
				.collect(Collectors.joining(" : ","(",")"));
	} 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("normal joining: "+joining_1());
		System.out.println("with using delimiter: "+joining_2());
		System.out.println("with using delimiter , prefifix and suffix: "+joining_3());
		

	}

}
