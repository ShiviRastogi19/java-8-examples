package practice.stream.terminalOperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class StreamMaxByMinByExample {

	public static Optional<Student> minBy(){
		return StudentDatabase.getAllStudent()
				.stream().collect(Collectors.minBy(Comparator.comparing(Student :: getGpa)));
	}
	public static Optional<Student> maxBy(){
		return StudentDatabase.getAllStudent()
				.stream().collect(Collectors.maxBy(Comparator.comparing(Student :: getGpa)));
	}
	
	public static int sum(){
		return StudentDatabase.getAllStudent()
				.stream().collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static double avg(){
		return StudentDatabase.getAllStudent()
				.stream().collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	public static void main(String[] args) {
		System.out.println("minBy() Example " + minBy());
		System.out.println("maxBy() Example " + maxBy());
		
		System.out.println("Total number of notebooks " + sum());
		
		System.out.println("Avg number of notebooks " + avg());

	}

}
