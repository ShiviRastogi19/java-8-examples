package interview.ques.deloitte;

import java.util.List;

public class University {
	private List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public University(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}
	
	public University() {
		
	}
	
	
}
