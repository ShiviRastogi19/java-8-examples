package practice.udemy.course.stream;

import java.util.Optional;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class FindAnyFirstExample {

	public static Optional<Student> findAnyStudent(){
		return StudentDatabase.getAllStudent()
				.stream().filter(std -> std.getGpa() >= 4.9)
				.findAny();
	}
	
	public static Optional<Student> findFirstStudent(){
		return StudentDatabase.getAllStudent()
				.stream().filter(std -> std.getGpa() >= 3.9)
				.findFirst();
	}
	public static void main(String[] args) {
		Optional<Student> std = findAnyStudent();
		if(std.isPresent()) {
			System.out.println("findAnyStudent" +std.get());
		}
		else {
			System.out.println("Not found");
		}
		
		Optional<Student> std1 = findFirstStudent();
		if(std1.isPresent()) {
			System.out.println("findFirstStudent" + std1.get());
		}
		else {
			System.out.println("Not found");
		}

	}
}
