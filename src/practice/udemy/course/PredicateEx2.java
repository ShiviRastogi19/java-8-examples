package practice.udemy.course;

import java.util.List;
import java.util.function.Predicate;

public class PredicateEx2 {
	
	public static  Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 3; 
	public static  Predicate<Student> p2 = (student) -> student.getGpa() >= 3.9;
	
	public static void filterByGradeLevel() {
		System.out.println("filterByGradeLevel");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(student -> {
			if(p1.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterByGpa() {
		System.out.println("filterByGpa");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(student -> {
			if(p2.test(student)) {
				System.out.println(student);
			}
		});
	}
	
	public static void filterByGpaAndGradeLevel() {
		System.out.println("filterByGpaAndGradeLevel");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(student -> {
			if(p1.and(p2).test(student)) {
				System.out.println(student);
			}
		});
	}
	public static void main(String[] args) {
		filterByGradeLevel();
		filterByGpa();
		filterByGpaAndGradeLevel();
	}
}
