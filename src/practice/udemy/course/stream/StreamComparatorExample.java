package practice.udemy.course.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class StreamComparatorExample {
	
	public static List<Student> sortStudentByName(){
		return StudentDatabase.getAllStudent().stream()
			.sorted(Comparator.comparing(std -> std.getName())) //sorting Stream<Employee> by emp name
			.collect(Collectors.toList());
		
	}
	
	public static List<Student> sortStudentByGpa(){
		
		/*
		 * StudentDatabase.getAllStudent().stream() .map(Student::getGpa)
		 * .sorted(Comparator.reverseOrder()) .forEach(System.out::println);
		 */
		
		return StudentDatabase.getAllStudent().stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed()) //sorting Stream<Employee> by emp gpa
			.collect(Collectors.toList());
		
		
	}
	public static void main(String[] args) {
		System.out.println(sortStudentByName());
		System.out.println(sortStudentByGpa());
	}
}
