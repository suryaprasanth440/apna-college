package java8;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Predicate<Student> pred=st->st.getGpa()>3;
		Map<String,List<String>> studentsMap=StudentDatabase.getAllStudents().stream()
				.filter(s->s.getGradeLevel()>3).filter(pred).collect(Collectors.toMap(Student::getName, Student::getActivities));
	    for(Map.Entry<String, List<String>> entry:studentsMap.entrySet()) {
	    	System.out.println(entry.getKey()+": "+entry.getValue());
	    }
	
	}

}
