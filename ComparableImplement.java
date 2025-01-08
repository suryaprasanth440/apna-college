import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students=new ArrayList<>(Arrays.asList(new Student(1,"prasanth",29,85000),
				new Student(3,"surya",31,50000),new Student(2,"dasa",32,70000),new Student(6,"sharara",30,40000)));
		//System.out.println(students);
		
		Collections.sort(students);
		students.forEach(s->System.out.println(s));

	}

}
