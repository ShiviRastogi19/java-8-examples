package practice.stream.terminalOperations;

import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class TerminalMappingExample {
	
	public static long count() {
		
		return StudentDatabase.getAllStudent().stream()
				.filter(std -> std.getGpa() > 3.9)
				.collect(Collectors.counting());
	}
	
	
	public static void main(String args[]) {
		System.out.println("count : "+count());
	}

}
