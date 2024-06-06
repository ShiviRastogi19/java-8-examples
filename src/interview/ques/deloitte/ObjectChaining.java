package interview.ques.deloitte;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectChaining {
	public static void main(String args[]) {
		
		Teacher t1 = new Teacher("T001","Padma");
		Teacher t2 = new Teacher("T002","Shree");
		
		Teacher t3 = new Teacher("T003","Raj");
		Teacher t4 = new Teacher("T004","Kumar");
		
		Department d1 = new Department(Arrays.asList(t1,t2));
		Department d2 = new Department(Arrays.asList(t3,t4));
		
		University u1 = new University(Arrays.asList(new Employee(Arrays.asList(d1,d2))));
		
		
		List<String> teacherIDList = u1.getEmployeeList().stream()  //Stream<Emp>
		.map(emp -> emp.getDepartmentList())  //Stream<Emp> to Stream<List<Dept>>
		.flatMap(List::stream)				  //Stream<Emp> to Stream<Dept>
		.map(dept -> dept.getTeacherlist())
		.flatMap(List::stream)
		.map(Teacher::getId)
		.collect(Collectors.toList());
		
		System.out.println(teacherIDList);
		
		/*
		 * u1.getEmployeeList().stream()		//Stream<List<Employee>>
		.flatMap(List::stream) 					//Stream<List<Employee>> to Stream<Employee>
		.map(emp -> emp.getDepartment()) 		//Stream<Employee> to Stream<List<Department>>
		.flatMap(List::stream) 					//Stream<List<Department>> to Stream<Department>
		.map(dept -> dept.getTeacher) 			//Stream<Department> to Stream<Teacher>
		.map(Teacher::getId);*/
	}
}
