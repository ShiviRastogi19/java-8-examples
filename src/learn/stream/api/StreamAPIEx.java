package learn.stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("Ravi",33));
		empList.add(new Employee("Vikas",18));
		empList.add(new Employee("Jaya",43));
		empList.add(new Employee("Ravi",43));
		empList.add(new Employee("Meeta",23));
		
		List<String> result = conditionalFilter(empList);
		for(String e : result) {
			System.out.println(e);
		}
		
		System.out.println("No of employee with age greater than 25 ::" + countFilterResult(empList));
		
		getEmployeewithName(empList,"Ravi");
	}
	//Given a list of employees, you need to filter all the employee whose age is greater than 20
	//and print the employee names
	public static List<String> conditionalFilter(ArrayList<Employee> list) {
		List<String> employeeFilteredList = list.stream()
			.filter(emp -> emp.getAge() > 20)
			.map(Employee :: getName)
			.collect(Collectors.toList());
		return employeeFilteredList;
	}
	//Given the list of employees, count number of employees with age 25
	public static long countFilterResult(ArrayList<Employee> list) {
		long count = list.stream()
						.filter(emp -> emp.getAge() > 25)
						.count();
		return count;
	}
	
	//Given the list of employees, find the employee with name “Mary”
	public static void getEmployeewithName(ArrayList<Employee> list,String name) {
		Optional<Employee> op = list.stream()
		.filter(emp-> emp.getName().equalsIgnoreCase(name))
		.findAny();
		
		if(op.isPresent())
            System.out.println("Found employee :: "+op.get());
	}
}
