import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ComparatorImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> employees=new ArrayList<>(Arrays.asList(new Employee(1,"prasanth",29,85000),
				new Employee(3,"surya",31,50000),new Employee(2,"dasa",32,70000),new Employee(6,"sharara",30,40000)));
	
		
		System.out.println("before sorting");
		employees.forEach(e->System.out.println(e));
		
		System.out.println("after sorting");
		Collections.sort(employees,new NameComparator());
		employees.forEach(e->System.out.println(e));
		
		System.out.println("sorting with age");
		Collections.sort(employees,new AgeComparator());
		employees.forEach(e->System.out.println(e));
		System.out.println("---------------------------------------");
		
		Optional<Employee> salaried=employees.stream().sorted((a,b)->a.getSalary()>b.getSalary()?-1:a.getSalary()<b.getSalary()?1:0).skip(1).findFirst();
		
		System.out.println(salaried);
	}

}
