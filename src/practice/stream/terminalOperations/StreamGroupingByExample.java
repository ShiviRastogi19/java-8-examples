package practice.stream.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class StreamGroupingByExample {

	public static void groupByGender() {
		Map<String, List<Student>> stdMap = StudentDatabase.getAllStudent()
		.stream()
		.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(stdMap);
	}
	
	public static void customizedGroupBy() {
		Map<String, List<Student>> stdMap = StudentDatabase.getAllStudent()
		.stream()
		.collect(Collectors.groupingBy(std -> std.getGpa() >= 3.8 ? "Outstanding" : "Average"
				));
		System.out.println(stdMap);
	}
	
	public static void twoLevelGrouping() {
		Map<Integer, Map<String,List<Student>>> stdMap = StudentDatabase.getAllStudent()
		.stream().collect(Collectors.groupingBy(Student::getGradeLevel,
				Collectors.groupingBy(std -> std.getGpa() >= 3.8 ? "Outstanding" : "Average")));
		System.out.println(stdMap);
	}
	
	/*
	 * public static void twoLevelGrouping_2() { Map<Integer,Integer> stdMap =
	 * StudentDatabase.getAllStudent() .stream()
	 * .collect(Collectors.groupingBy(Student::getGradeLevel,
	 * summingInt(Student::getNoteBooks))); System.out.println(stdMap); }
	 */
	public static void main(String[] args) {
		//groupByGender();
		//customizedGroupBy();
		twoLevelGrouping();
	}

}
