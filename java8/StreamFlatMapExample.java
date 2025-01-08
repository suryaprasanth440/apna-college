package java8;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
	
	public static List<String> printStudentActivities(){
		List<String> studActivities=StudentDatabase.getAllStudents()
				.stream()   //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				//.distinct() //unique elements
				//.sorted()
				.collect(Collectors.toList());
		return studActivities;
	}

	public static Long  printStudentActivitiesCount(){
		Long studActivitiesCount=StudentDatabase.getAllStudents()
				.stream()   //Stream<Student>
				.map(Student::getActivities) //Stream<List<String>>
				.flatMap(List::stream)   //Stream<String>
				.distinct() //unique elements //Stream<String> ->with distinct function performed 
				.count();
		return studActivitiesCount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                System.out.println(printStudentActivities());
                System.out.println(printStudentActivitiesCount());
                
                
	}

}
