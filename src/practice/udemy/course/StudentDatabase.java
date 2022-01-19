package practice.udemy.course;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
	
	public static Supplier<Student> studentSupplier = () -> {
		return new Student("Adam",2,3.5,"Female",Arrays.asList("Swimming","Basket Ball"),11);
	};
	
	public static List<Student> getAllStudent(){
		
		Student std1 = new Student("Adam",2,3.5,"Female",Arrays.asList("Swimming","Basket Ball"),11);
		
		Student std2 = new Student("Eva",2,4.5,"Female",Arrays.asList("Swimming","Volley Ball"),15);
		
		Student std3 = new Student("Rita",3,3.0,"Female",Arrays.asList("Reading","Dancing"),8);
		
		Student std4 = new Student("Meyer",3,4.1,"Male",Arrays.asList("Music","Reading"),3);
		
		Student std5 = new Student("Sid",4,3.9,"Male",Arrays.asList("Cricket","Blogging"),9);
		
		Student std6 = new Student("Test",4,4.6,"Male",Arrays.asList("Painting","Journal Writing"),11);
		
		List<Student> stdList = Arrays.asList(std1,std2,std3,std4,std5,std6);
		
		return stdList;
		
	}

}
