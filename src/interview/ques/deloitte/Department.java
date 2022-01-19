package interview.ques.deloitte;

import java.util.List;

public class Department {
	private List<Teacher> teacherlist;

	public List<Teacher> getTeacherlist() {
		return teacherlist;
	}

	public void setTeacherlist(List<Teacher> teacherlist) {
		this.teacherlist = teacherlist;
	}

	public Department(List<Teacher> teacherlist) {
		super();
		this.teacherlist = teacherlist;
	}

	public Department() {
		super();
	}

}
