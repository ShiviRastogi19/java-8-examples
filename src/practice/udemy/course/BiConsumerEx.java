package practice.udemy.course;

import java.util.List;
import java.util.function.Consumer;

public class BiConsumerEx {
	
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
	
	public static void printStudents() {
		System.out.println("printStudents");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(c1);
	}
	
	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(c2.andThen(c3));
	}
	
	public static void printNameAndActivitiesFilter() {
		System.out.println("printNameAndActivitiesFilter");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(std -> {
			if(std.getGradeLevel() >= 3) {
				c2.andThen(c3).accept(std);
			}
		});
	}
	
	public static void main(String[] args) {
		printStudents();
		
		printNameAndActivities();
		
		printNameAndActivitiesFilter();
	}

}
