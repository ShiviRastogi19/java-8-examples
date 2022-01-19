package practice.udemy.course.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamExample {
	//range(start,end) excluding end range and rangeClosed(start,end) available in IntStream and LongStream

	public static int sumOfNNumbers(List<Integer> list) {
		return list.stream().reduce(0,(x,y)-> x+y); //unboxing to convert the Integer to int
	}
	
	public static int sumOfNNumbersIntStream() {
		return IntStream.rangeClosed(1,6)
				.sum();  // Aggregated functions min(), max(), sum(), count()
	}
	
	public static long sumOfNNumbersLongStream() {
		return LongStream.range(1,6)
				.sum();  // Aggregated functions min(), max(), sum(), average()
	}
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
		System.out.println("Sum of n numbers : " +sumOfNNumbers(intList));
		
		System.out.println("Sum of n numbers using IntStream : " +sumOfNNumbersIntStream());
		System.out.println("Sum of n numbers using  LongStream: " +sumOfNNumbersLongStream());
		
		OptionalDouble optioanlDouble = IntStream.rangeClosed(1, 50).average();
		System.out.println(optioanlDouble.isPresent() ? optioanlDouble.getAsDouble() : 0.0);
		
		
		List<Integer> integerList = IntStream.rangeClosed(1, 10) //int
				.boxed() //Integer boxed from int to Integer
				.collect(Collectors.toList());
		
		System.out.println(integerList);
		
		System.out.print(unBoxing(integerList));
	}
	
	public static int unBoxing(List<Integer> list) {
		return list.stream()
		.mapToInt(Integer::intValue)
		.sum();
	}
}
