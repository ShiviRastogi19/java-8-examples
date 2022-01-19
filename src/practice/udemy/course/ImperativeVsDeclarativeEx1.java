package practice.udemy.course;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Imperative Style 
		
		int sum =0;
		for(int i=0;i<=100;i++) {
			sum += i;
		}
		
		System.out.println("Sum using imparative style " + sum);
		
		//Declarative style
		
		int sum1 = IntStream.rangeClosed(0, 100).sum();
		
		System.out.println("Sum using declarative style " + sum1);
	}

}
