package practice.udemy.course;

import java.util.function.Consumer;

public class LambdaVariableEx1 {
	public static void main(String arg[]) {
		
		int i =0;
	
		Consumer<Integer> c1 = (i1) -> {
			System.out.println("Value of i : " +i1);
		};
		c1.accept(10);
	}
}
