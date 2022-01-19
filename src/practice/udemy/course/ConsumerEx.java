package practice.udemy.course;

import java.util.List;
import java.util.function.BiConsumer;

public class ConsumerEx {
	
	
	static BiConsumer<String,List<String>> c2 = (name,activities) -> System.out.println("Name : "+ name+ "\t Activities : "+ activities);
	
	public static void printNameAndActivities() {
		System.out.println("printNameAndActivities");
		List<Student> stdList = StudentDatabase.getAllStudent();
		
		stdList.forEach(student -> c2.accept(student.getName(), student.getActivities()));
	}
	public static void main(String[] args) {
		printNameAndActivities();
		
	}

}
