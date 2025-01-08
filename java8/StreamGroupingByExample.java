package java8;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamGroupingByExample {
	
	public static void groupStudentsByGender() {
	Map<String,List<Student>> studentMap=	StudentDatabase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGender));
	System.out.println(studentMap);
	}
	
	public static void customisedGroupingBy() {
		Map<String,List<Student>> studentMap=	StudentDatabase.getAllStudents().stream()
			.collect(Collectors.groupingBy(s->s.getGpa()>3?"OUTSTANDING":"AVERAGE"));
		System.out.println(studentMap);
		}
	
	public static void twoLevelGrouping_1() {
		Map<Integer,Map<String,List<Student>>> studentMap=	StudentDatabase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.groupingBy(s->s.getGpa()>3?"OUTSTANDING":"AVERAGE")));
		System.out.println(studentMap);
		}

	public static void threeArgumentsGroupingBy() {
		Map<String,Set<Student>> studentMap=	StudentDatabase.getAllStudents().stream()
			.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
		System.out.println(studentMap);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//groupStudentsByGender();
		//customisedGroupingBy();
		// twoLevelGrouping_1();
		
		threeArgumentsGroupingBy();
	}

}
