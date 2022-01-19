package practice.udemy.course.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class StreamReduceExample {
	
	public static int performMultiplication(List<Integer> num) {
		return num.stream().reduce(1,(a,b) -> a*b);
	}
	public static Optional<Integer> performMultiplication2(List<Integer> num) {
		return num.stream().reduce((a,b) -> a*b);
	}
	
	public static Optional<Student> studentWithMaxGpa() {
		
		/*
		 * System.out.println("Max gpa " +StudentDatabase.getAllStudent().stream()
		 * .max(Comparator.comparing(Student::getGpa)).get());
		 */
		
		return StudentDatabase.getAllStudent().stream()
		.reduce((s1,s2) -> {             // -> {s1.getGpa > s2.getGpa ? s1 : s2}
			if(s1.getGpa() >  s2.getGpa()) {      
				return s1;
			}
			else {
				return s2;
			}
		});
	}
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1,2,3,4,5,6);
		System.out.println(performMultiplication(num));
		
		Optional<Integer> res = performMultiplication2(num);
		
		System.out.println(res.get());
		System.out.println(res.isPresent());
		
		Optional<Student> studentOptional = studentWithMaxGpa();
		if(studentOptional.isPresent()) {
			System.out.println(studentOptional.get());
		}
	}
}
