package practice.udemy.course.parallelStream;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class ParallelStreamBoxedEx {
	
	public static List<String> seqPrintStdActivities(){
		long startTime = System.currentTimeMillis();
		
		List<String> stdActivitiesList = StudentDatabase.getAllStudent()
				.stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		return stdActivitiesList;
	}
	
	public static List<String> parallelPrintStdActivities(){
long startTime = System.currentTimeMillis();
		
		List<String> stdActivitiesList = StudentDatabase.getAllStudent()
				.stream()
				.parallel()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		return stdActivitiesList;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("Seq ::" + seqPrintStdActivities());
		
		System.out.println("Parallel ::" + parallelPrintStdActivities());
	}

}
