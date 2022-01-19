package practice.stream.terminalOperations;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class TerminalJoiningExample {

	
	
	public static void main(String args[]) {
		List<String> stdNameList = StudentDatabase.getAllStudent()
		.stream()
		.collect(Collectors.mapping(Student::getName,Collectors.toList()));
		
		System.out.println("stdNameList :" +stdNameList);
		
		Set<String> stdNameSet = StudentDatabase.getAllStudent()
				.stream()
				.collect(Collectors.mapping(Student::getName,Collectors.toSet()));
		
		System.out.println("stdNameSet :" +stdNameSet);
	}

}
