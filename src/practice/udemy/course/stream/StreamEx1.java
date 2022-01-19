package practice.udemy.course.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class StreamEx1 {

	public static void main(String[] args) {
		//student name and their activities in map
		
		List<Student> std_list = StudentDatabase.getAllStudent();
		Predicate<Student> std_predicate = std -> { return std.getGpa() > 3.5; } ;
		
		
		Map<String,List<String>> std_map = std_list.stream()
				.filter(student -> student.getGradeLevel() >= 3.9)
				.filter(std_predicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		System.out.println(std_map);

	}
}
