package PracticeJava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Interview.Employee;
import java.util.*;
public class EmployeeDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "abc", 22, 12300, "F", "HR", "Blore", 2020));
		empList.add(new Employee(2, "xyz", 29, 12000, "F", "HR", "Hyderabad", 2015));
		empList.add(new Employee(3, "efg", 30, 11500, "M", "Sales", "Chennai", 2014));
		empList.add(new Employee(4, "def", 32, 12500, "F", "HR", "Chennai", 2013));

		empList.add(new Employee(5, "ijk", 22, 75000, "F", "IT", "Noida", 2013));
		empList.add(new Employee(6, "mno", 32, 140000, "M", "IT", "Gurugram", 2017));
		empList.add(new Employee(7, "uvw", 26, 130012, "F", "Production", "Pune", 2016));
		empList.add(new Employee(8, "pqr", 23, 140005, "M", "IT", "Trivandam", 2015));
		empList.add(new Employee(9, "stv", 25, 160000, "M", "IT", "Blore", 2010));

		//1.Group the Employees by city.
		Map<String,List<Employee>> empByCity=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println(empByCity);
        empByCity.entrySet().forEach(s->System.out.println(s.getKey()+"--"+s.getValue()));
       
        //2. Group the Employees by age.
        System.out.println("Group the Employees by age:------------------------");
        
    	Map<Integer,List<Employee>> empByAge=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
        
    	empByAge.entrySet().forEach(s->System.out.println(s.getKey()+"--"+s.getValue()));
       
    	//3. Find the count of male and female employees present in the organization.
    	System.out.println("Find the count of male and female employees present in the organization");
    	Map<String,Long> countOfMF=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	    System.out.println(countOfMF);
	    
	    //4. Print the names of all departments in the organization.
	    System.out.println("Print the names of all departments in the organization.");
	   List<String> deps= empList.stream().map(Employee::getDeptName).distinct().collect(Collectors.toList());
	  System.out.println(deps);
	  
	  //5. Print employee details whose age is greater than 28.
	  System.out.println("Print employee details whose age is greater than 28.");
	  empList.stream().filter(st->st.getAge()>28).forEach(System.out::println);
	  
	  //6. Find maximum age of employee.
	  System.out.println("Find maximum age of employee.");
	 Optional<Employee> maxAge= empList.stream().sorted((e1,e2)->e1.getAge()>e2.getAge()?-1:e1.getAge()<e2.getAge()?1:0).findAny();
	 Integer a=maxAge.get().getAge();
	 System.out.println(maxAge.get().getAge());
	 
	 List<Employee> li=empList.stream().filter(di->di.getAge()==a).toList();
	 System.out.println(li);
	 
	 //7. Print Average age of Male and Female Employees.
	 System.out.println("Print Average age of Male and Female Employees.");
	Map<String,Double> avgageMF= empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
	 System.out.println(avgageMF);
	 
	 //8. Print the number of employees in each department.
	 System.out.println("Print the number of employees in each department.");
	 Map<String,Long> noEmpinEachDept=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
	 System.out.println(noEmpinEachDept);
	 
	 //10. Find youngest female employee.
	 System.out.println("Find youngest female employee.");
	 Employee bye=empList.stream().filter(et->et.getGender().equals("F")).sorted(Comparator.comparing(Employee::getAge)).findFirst().get();
	 Optional<Employee> bye2=empList.stream().filter(et->et.getGender().equals("F")).collect(Collectors.minBy(Comparator.comparingInt(Employee::getAge)));
	 Integer b=bye.getAge();
	 List<Employee> fe=empList.stream().filter(en->en.getAge()==b).toList();
	 System.out.println(fe);
	 System.out.println("====------======------"+bye2);
	 
	 
	 //Find highest salaried person in each dept
	 
	 System.out.println("Find highest salaried person in each dept");
	 Map<String,Optional<Employee>> depSalcomb=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
	  
	 depSalcomb.entrySet().forEach(u->System.out.println(u.getKey()+"====="+u.getValue()));
	  
	  
	  Integer h=empList.stream().mapToInt(Employee::getAge).sum();
	  
	  System.out.println(h);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}

}
