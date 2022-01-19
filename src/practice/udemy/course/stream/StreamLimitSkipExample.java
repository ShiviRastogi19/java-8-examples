package practice.udemy.course.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {
	
	public static Optional<Integer> limit(List<Integer> integers){
		return integers.stream().limit(3)
				.reduce(Integer :: sum);
	}
	
	public static Optional<Integer> skip(List<Integer> integers){
		return integers.stream().skip(3)
				.reduce(Integer :: sum);
	}
	
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(6,7,8,9,10);
		Optional<Integer> sumFirstThree = skip(integers); //limit(integers);
		if(sumFirstThree.isPresent()) {
			System.out.println("Sum of 3 int " + sumFirstThree.get());
		}
	}
	
	
}
