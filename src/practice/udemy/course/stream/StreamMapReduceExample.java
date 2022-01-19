package practice.udemy.course.stream;

import java.util.Optional;

import practice.udemy.course.StudentDatabase;

public class StreamMapReduceExample {
	
	public static int totalNotebooks() {
		return StudentDatabase.getAllStudent().stream()
		.map(std -> std.getNoteBooks())
		//.reduce(0,(a,b) -> a+b);
		.reduce(0, Integer :: sum);
	}
	
	public static int studentWithMaxNotebooks() {
		return StudentDatabase.getAllStudent().stream()
		.map(std -> std.getNoteBooks())
		//.reduce(0,(a,b) -> a+b);
		.reduce(0, Integer :: max);
	}
	
	public static Optional<Integer> studentWithMaxNotebooksOpt() {
		return StudentDatabase.getAllStudent().stream()
		.map(std -> std.getNoteBooks())
		//.reduce(0,(a,b) -> a+b);
		.reduce(Integer :: max);  // not use default value in case of min-max
	}
	
	public static int studentWithMinNotebooks() {
		return StudentDatabase.getAllStudent().stream()
		.map(std -> std.getNoteBooks())
		//.reduce(0,(a,b) -> a+b);
		.reduce(0, Integer :: min);  //will return 0 if all values are greater than 0
	}
	
	public static Optional<Integer> studentWithMinNotebooksOpt() {
		return StudentDatabase.getAllStudent().stream()
		.map(std -> std.getNoteBooks())
		//.reduce(0,(a,b) -> a+b);
		.reduce(Integer :: min);  //will return 0 if all values are greater than 0
	}
	public static void main(String[] args) {
		
		System.out.println("Total no. of notebooks : " +totalNotebooks());
		System.out.println("Student with max notebooks " +studentWithMaxNotebooks());
		System.out.println("Student with min notebooks " +studentWithMinNotebooks());
		
		if(studentWithMinNotebooksOpt().isPresent()) {
			System.out.println("Student with min notebooks " +studentWithMinNotebooksOpt().get());
		}
		else {
			System.out.println("No min value");
		}
		
		if(studentWithMaxNotebooksOpt().isPresent()) {
			System.out.println("Student with max notebooks " +studentWithMaxNotebooksOpt().get());
		}
		else {
			System.out.println("No max value");
		}
		
	}
}
