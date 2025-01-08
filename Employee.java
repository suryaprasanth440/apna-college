
public class Employee {
     private int id;
     private String empName;
     private int age;
     private int salary;
     
     public Employee() {
    	 
     }

	public Employee(int id, String empName, int age, int salary) {
		super();
		this.id = id;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", empName=" + empName + ", age=" + age + ", salary=" + salary ;
	}
     
     
}
