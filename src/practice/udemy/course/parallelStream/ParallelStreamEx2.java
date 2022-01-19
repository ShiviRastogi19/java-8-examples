package practice.udemy.course.parallelStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamEx2 {
	
	public static int sequentialSum(List<Integer> integerList) {
		long start = System.currentTimeMillis();
		int sum = integerList.stream()
			.reduce(0,(x,y) -> x+y);
		long end = System.currentTimeMillis();
		System.out.println("Duration for seq sum  : " + (end-start));
		return sum;
	}
	
	public static int parallelSum(List<Integer> integerList) {
		long start = System.currentTimeMillis();
		int sum = integerList.stream().parallel()
			.reduce(0,(x,y) -> x+y);
		long end = System.currentTimeMillis();
		System.out.println("Duration for parallel sum  : " + (end-start)); //it needs to perform the unboxing from integer to int
		return sum;
	}
	public static void main(String[] args) {
		List<Integer> list = IntStream.rangeClosed(1, 10000)
			.boxed()
			.collect(Collectors.toList());
		
		sequentialSum(list);
		parallelSum(list);
	}

}
