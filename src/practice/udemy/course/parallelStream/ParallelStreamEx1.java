package practice.udemy.course.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEx1 {
	
	public static long checkPerformance(Supplier<Integer> supplier, int noOfTimes) {
		
		long startTime = System.currentTimeMillis();
		for(int i=0;i<noOfTimes;i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}
	public static int sumSequentialStream(){
		return IntStream.rangeClosed(0, 100000)
			.sum();
	}
	public static int sumParallelStream(){
		return IntStream.rangeClosed(0, 100000)
				.parallel()
				.sum();
	}
	public static void main(String[] args) {
		
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println("Seq Sum ::" + checkPerformance(ParallelStreamEx1::sumSequentialStream,20));
		
		System.out.println("Parallel Sum ::" + checkPerformance(ParallelStreamEx1::sumParallelStream,20));
	}

}
