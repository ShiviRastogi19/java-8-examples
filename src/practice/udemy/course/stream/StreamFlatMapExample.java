package practice.udemy.course.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import practice.udemy.course.StudentDatabase;

public class StreamFlatMapExample {
	
	public static List<String> printStudentActivities(){
		
		List<String> activitiesList = StudentDatabase.getAllStudent().stream() // List<Employee> -> Stream<Employee>
				.map(std -> std.getActivities()) // Stream<Employee> -> Stream<List<String>>
				.flatMap(List::stream) //Stream<List<String>> -> Stream<String>
				.distinct()
				.sorted()//.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		long n = StudentDatabase.getAllStudent().stream() // List<Employee> -> Stream<Employee>
				.map(std -> std.getActivities()) // Stream<Employee> -> Stream<List<String>>
				.flatMap(List::stream) //Stream<List<String>> -> Stream<String>
				.distinct()
				.sorted()
				.count();
		
		System.out.println(n);
		
		return activitiesList;
	}
	public static void main(String[] args) {
		System.out.println(printStudentActivities());
	}
}
