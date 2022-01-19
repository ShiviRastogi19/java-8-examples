package interview.ques.virtusa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSample {
	
	String id;
	String name;
	String gender;
	String age;
	String dept;
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String getDept() {
		return dept;
	}



	public void setDept(String dept) {
		this.dept = dept;
	}

	public EmployeeSample(String id, String name, String gender, String age, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.dept = dept;
	}



	public static void main(String[] args) {
		List<EmployeeSample> empList = new ArrayList<EmployeeSample>();
		empList.add(new EmployeeSample("1", "Anjali", "Female","26", "CSE"));
		empList.add(new EmployeeSample("2", "A", "Male","21", "IT"));
		empList.add(new EmployeeSample("3", "B", "Female","16", "IT"));
		empList.add(new EmployeeSample("4", "C", "Female","36", "CSE"));
		empList.add(new EmployeeSample("5", "D", "Male","20", "IT"));
		empList.add(new EmployeeSample("6", "E", "Male","23", "CSE"));
		
		List<EmployeeSample> result = (List<EmployeeSample>) empList.stream()
				.filter(emp -> emp.getGender() == "Male")
				.collect(Collectors.groupingBy(emp -> emp.getDept()));
		
		System.out.println(result);
	}

}
