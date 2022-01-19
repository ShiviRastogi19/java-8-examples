package practice.stream.terminalOperations;

import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class TerminalCountingExample {
	
	public static String joining_1() {
		
		return StudentDatabase.getAllStudent().stream()
			.map(Student::getName)
			.collect(Collectors.joining());
	}
	
	public static String joining_2() {
		
		return StudentDatabase.getAllStudent().stream()
			.map(Student::getName)
			.collect(Collectors.joining(" - "));
	}
	
	public static String joining_3() {
		
		return StudentDatabase.getAllStudent().stream()
			.map(Student::getName)
			.collect(Collectors.joining(" - ","(",")"));
	}
	
	public static void main(String args[]) {
		System.out.println("joining_1 : "+joining_1());
		System.out.println("joining_2 : "+joining_2());
		System.out.println("joining_2 : "+joining_3());
	}

}
