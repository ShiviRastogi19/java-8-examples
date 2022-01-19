package practice.udemy.course;

import java.util.function.Consumer;

public class LambdaVariableEx2 {
	public static void main(String arg[]) {
		
		int value = 4;
	
		Consumer<Integer> c1 = (i) -> {
			System.out.println(value + i);
		};
		c1.accept(10);
	}
}
