package Interview;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class EmployeeImplementation {

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

		System.out.println(empList);
		//1. Group the Employees by city
		
		Map<String,List<Employee>> empByCity=empList.stream().collect(Collectors.groupingBy(Employee::getCity));
		System.out.println("Employees grouped by city :: \n" + empByCity);
		
		//2. Group the Employees by age
		Map<Integer,List<Employee>> empByAge=empList.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println("Employees grouped by age :: \n" + empByAge);
		
		//3. Find the count of male and female employees present in the organization.
		Map<String,Long> noOfMaleAndFemaleEmployees=empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		System.out.println("Find the count of male and female employees :: \n" + noOfMaleAndFemaleEmployees);
	
		// find highest salaried person grouping by deptname
		Map<String,Optional<Employee>> emp=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
	     emp.entrySet().stream().map(e->e.getKey()+"==="+e.getValue()).forEach(System.out::println);
	     System.out.println("******************************************");
	     emp.entrySet().stream().forEach(m->System.out.println(m.getKey()+":"+m.getValue()));
	
	     //4. Print the names of all departments in the organization.
	     List<String> alldept=empList.stream().map(Employee::getDeptName).distinct().toList();
	     System.out.println(alldept);
	
	     //5. Print employee details whose age is greater than 28.
	     System.out.println("employee details whose age is greater than 28:");
	     empList.stream().filter(s->s.getAge()>28).forEach(System.out::println);
	     
	     //6. Find maximum age of employee.
	    OptionalInt maxAge= empList.stream().mapToInt(Employee::getAge).max();
	    if(maxAge.isPresent()) {
	    	System.out.println("max age is:"+maxAge.getAsInt());
	    }
	
	    
	    // Find employee with max age
        Optional<Employee> maxAgeEmployee = empList.stream()
                .max((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));

        if (maxAgeEmployee.isPresent()) {
            System.out.println("Employee with max age: " + maxAgeEmployee.get());
        } else {
            System.out.println("No employee found");
        }
        
     // Find the employee with the maximum age using Collectors.maxBy
        Optional<Employee> maxAgeEmployee1 = empList.stream()
            .collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));

        maxAgeEmployee1.ifPresent(employee -> 
            System.out.println("Employee with max age: " + employee));
        
        //7. Print Average age of Male and Female Employees.
       Map<String,Double> avgAge= empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
	System.out.println("avg age of male and female employees:"+avgAge);
	
	//8. Print the number of employees in each department.
	Map<String,Long> empinEachDept=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
	System.out.println("number of employees in each department:"+empinEachDept);
	
	//9. Find oldest employee.
	Optional<Employee> oldestEmp = empList.stream().max(Comparator.comparingInt(Employee::getAge));
	Employee oldestEmployee = oldestEmp.get();
	System.out.println("Oldest employee details:: \n" + oldestEmployee);
	
	
	 // Find the maximum age first
    Optional<Integer> maxAge1 = empList.stream()
                                        .map(Employee::getAge)  // Extract ages
                                        .max(Integer::compareTo);  // Find the max age
    

    if (maxAge1.isPresent()) {
        // Filter employees with the maximum age
        List<Employee> oldestEmployees = empList.stream()
                                                  .filter(emp1 -> emp1.getAge() == maxAge1.get())  // Match max age
                                                  .collect(Collectors.toList());

        System.out.println("Employees with the maximum age: ");
        oldestEmployees.forEach(System.out::println);
    } else {
        System.out.println("No employees found.");
    }

    System.out.println("################################");
    Integer m1=empList.stream().mapToInt(Employee::getAge).max().getAsInt();
    System.out.println(m1);
    empList.stream().filter(x->x.getAge()==m1).forEach(System.out::println);
    
    //10. Find youngest female employee.only one employee
   Employee fe= empList.stream().filter(l->l.getGender().equals("F")).sorted(Comparator.comparing(Employee::getAge)).findFirst().get();
    
	System.out.println(fe);
	  //10. Find youngest female employee.if many employees are there with same age
	Integer minf=empList.stream().filter(b->b.getGender().equals("F")).mapToInt(Employee::getAge).min().getAsInt();
	empList.stream().filter(aa->aa.getAge()==minf).forEach(System.out::println);
	
	//11. Find employees whose age is greater than 30 and less than 30.
	
	Map<Boolean,List<Employee>> thirty=empList.stream().collect(Collectors.partitioningBy(pp->pp.getAge()>30));
	for(Map.Entry<Boolean, List<Employee>> entry:thirty.entrySet()) {
		if(entry.getKey()==true) {
			System.out.println("employees greaterthan 30:"+entry.getValue());
		}
		else {
			System.out.println("employees lessthan 30:"+entry.getValue());
		}
		
	
	}
	
	//12. Find the department name which has the highest number of employees.
	Map.Entry<String, Long> ss=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();
	System.out.println(ss.getKey());
	
	//13. Find if there any employees from HR Department.
	System.out.println("-------------13---------------------");
	List<Employee> hrEmp=empList.stream().filter(nt->nt.getDeptName().equals("HR")).collect(Collectors.toList());
	System.out.println(hrEmp);
	
	//14. Find the department names that these employees work for, where the number of employees in the department is over 3.
	System.out.println("-------------------------------14---------------------------------");
	empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream().filter(ent->ent.getValue()>3).forEach(System.out::println);
	
	//15 . Find distinct department names that employees work for.
	System.out.println("-------------------------15---------------------");
	empList.stream().map(Employee::getDeptName).distinct().forEach(System.out::println);
	
	//16. Find all employees who lives in ‘Blore’ city, sort them by their name and print the names of employees.
	System.out.println("-------------------------------16----------------------------------");
	empList.stream().filter(bnm->bnm.getCity().equals("Blore")).sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
	
	//17. No of employees in the organisation.
	Long empInOrg=empList.stream().count();
	System.out.println(empInOrg);
	
	
	//18. Find employee count in every department
	System.out.println("---------------------18------------------------------");
	Map<String,Long> cntInDept=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
	System.out.println(cntInDept);
	
	//19. Find the department which has the highest number of employees.
	Optional<Entry<String, Long>> deptHigh=empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue());
	System.out.println(deptHigh.get());
	
	//20. Sorting a Stream by age and name fields.
	System.out.println("-------------------------20-------------------");
	Comparator<Employee> comp1=Comparator.comparing(Employee::getAge);
	Comparator<Employee> comp2=Comparator.comparing(Employee::getName);
	empList.stream().sorted(comp1.thenComparing(comp2)).forEach(System.out::println);
	}

}
