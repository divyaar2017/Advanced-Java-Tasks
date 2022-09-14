package divya.advancedjavaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Employee{
	
	int empId;
	String empName;
	float salary;
	
	public Employee(int id,String name,float sal) {
		
		this.empId = id;
		this.empName = name;
		this.salary =  sal;
	}
	
}

public class LamdaExpressionDemo2 {
	
	public static void main(String args[]) {
		
		List<Employee> emp = new ArrayList<Employee>();
				
		emp.add(new Employee(1,"Adhvik",15000f));
		emp.add(new Employee(2,"Prabhu",25000f));
		emp.add(new Employee(3,"Divya",15000f));
		
		Stream<Employee> salary_data = emp.stream().filter(p->p.salary>15000);
		//Stream<Employee> salary_data1 = emp.stream().filter(p->p.empId=1); error
		
		salary_data.forEach(
				employee-> {System.out.println(employee.empName + " salary : "+ employee.salary);}
				
		);
		
		//emp.forEach(employee -> {System.out.println(employee.empName +" "+ employee.salary);}

		//);
	}

}
