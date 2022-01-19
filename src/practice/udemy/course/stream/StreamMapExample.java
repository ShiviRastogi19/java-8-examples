package practice.udemy.course.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class StreamMapExample {

	public static void main(String[] args) {
		//student name and their activities in map
		
		List<Student> std_list = StudentDatabase.getAllStudent();
		List<String> names_list = std_list.stream()
				.map(std -> std.getName())
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(names_list);
		
		Set<String> names_set = std_list.stream()
				.map(std -> std.getName())
				.map(String::toUpperCase)
				.collect(Collectors.toSet());
		System.out.println(names_set);

	}
}
