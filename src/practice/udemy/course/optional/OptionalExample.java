package practice.udemy.course.optional;

import java.util.Optional;

import practice.udemy.course.Student;
import practice.udemy.course.StudentDatabase;

public class OptionalExample {

	public static String getStudentName() {
		Student std = StudentDatabase.studentSupplier.get();

		// Student std = null;
		if (std != null) {
			return std.getName();
		}

		return null;
	}

	public static Optional<String> getStudentNameOptional() {

		// Optional<Student> std =
		// Optional.ofNullable(StudentDatabase.studentSupplier.get());
		Optional<Student> std = Optional.ofNullable(null);
		if (std.isPresent()) {
			return std.map(Student::getName);
		}

		return Optional.empty();

	}

	public static void main(String args[]) {

		/*
		 * String name = getStudentName();
		 * System.out.println("Length of the student name : " + name.length());
		 */

		Optional<String> stdOptional = getStudentNameOptional();
		if (stdOptional.isPresent()) {
			System.out.println(stdOptional.get().length());
		} else {
			System.out.println("Name not found");
		}
	}

}
