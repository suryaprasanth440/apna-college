package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeJava8Questions {
	public static void main(String[] args) {

		
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "prasanth", 29, 12300, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "manasa", 22, 12000, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "rajesh", 30, 11500, "M", "Sales", "Chennai", 2014));
		empList.add(new Employee(4, "divya", 28, 12500, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "sarayu", 29, 75000, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "dinesh", 30, 140000, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130012, "F", "Production", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 140005, "M", "IT", "Hyderabad", 2015));
		empList.add(new Employee(9, "stv", 25, 160000, "M", "IT", "Blore", 2010));
		
		//1)Group the Employees by city.
		System.out.println("-----------------------------------1-------------------------------");
		Map<String,List<Employee>> empByCity=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		empByCity.entrySet().stream().forEach(System.out::println);
		System.out.println("------------------2-----------------");
		
		//2. Group the Employees by age.
		Map<Integer,List<Employee>> empByAge=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		empByAge.entrySet().stream().forEachOrdered(System.out::println);
		System.out.println("-----------------3----------------------------------");
		
		//3. Find the count of male and female employees present in the organization.
		Map<String,Long> groupbygenderCount=empList.stream().collect(Collectors.groupingBy(m->m.getGender(),Collectors.counting()));
	    System.out.println(groupbygenderCount);
	    System.out.println("-----------------4----------------------------------");
	    
	    //4. Print the names of all departments in the organization
	    empList.stream().map(Employee::getDeptName).distinct().forEach(n->System.out.print(n+" "));
	    System.out.println("----------------------------5-----------------------------");
	    
	    //5. Print employee details whose age is greater than 28.
	    empList.stream().filter(e->e.getAge()>28).forEach(System.out::println);
	    System.out.println("----------------------------6------------------------");
	    
	    //6. Find maximum age of employee.
	    Integer age=empList.stream().map(Employee::getAge).max((i,j)->i>j?1:i<j?-1:0).get();
	    System.out.println(age);
	   List<Employee> maxAge= empList.stream().filter(emp->emp.getAge()==age).collect(Collectors.toList());
	    System.out.println(maxAge);
	    System.out.println("----------------------------7--------------------------------");
	    
	    //7. Print Average age of Male and Female Employees.
	   Map<String,Double> avgAgeOfGenderWise= empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge)));
	   System.out.println(avgAgeOfGenderWise);
	}
}
