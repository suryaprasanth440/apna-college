package java8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {
	
	public static List<String> namesList(){
		List<String> studList=StudentDatabase.getAllStudents().stream()//Stream<Student>
				//Student as an input ->Student Name
				.map(s->s.getName()) //Stream<String>
				.map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
				.collect(Collectors.toList());//List<String>
		return studList;
	}

	public static Set<String> namesSet(){
		Set<String> studSet=StudentDatabase.getAllStudents().stream()//Stream<Student>
				//Student as an input ->Student Name
				.map(Student::getName) //Stream<String>
				.map(String::toUpperCase) //Stream<String> -> uppercase operation on each input
				.collect(Collectors.toSet());//Set<String>
		return studSet;
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(namesList());
		System.out.println(namesSet());

	}

}
