package java8;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	public static List<Student> getAllStudents(){
		
		Student s1=new Student("Adam",2,3.6,"male",Arrays.asList("swimming","basketball","volleyball"));
		Student s2=new Student("Surya",3,5.6,"male",Arrays.asList("shuttle","football","volleyball"));
		
		Student s3=new Student("Divya",5,3,"female",Arrays.asList("football","basketball","volleyball"));
		
		Student s4=new Student("Prasanth",7,3.9,"male",Arrays.asList("swimming","shuttle","kabaddi"));
		
		Student s5=new Student("Mallika",4,3.8,"female",Arrays.asList("handball","carrom","cricket"));
		
		Student s6=new Student("Siva",5,2.1,"male",Arrays.asList("dargeball","basketball","volleyball"));
		List<Student> students=Arrays.asList(s1,s2,s3,s4,s5,s6);
		return students;
		
	}

}
