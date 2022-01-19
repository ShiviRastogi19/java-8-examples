package interview.ques.deloitte;

import java.util.List;

public class Employee {
	private List<Department> departmentList;

	public List<Department> getDepartmentList() {
		return departmentList;
	}

	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}

	public Employee(List<Department> departmentList) {
		super();
		this.departmentList = departmentList;
	}
	
	public Employee() {
		
	}
	
}

