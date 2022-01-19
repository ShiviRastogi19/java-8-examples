package practice.udemy.course;

import java.util.Comparator;

public class LambdaEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prior Java 8
		
		Comparator<Integer> c1 = new Comparator<>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		
		System.out.println("Result of comapartor using legacy " + c1.compare(13, 6));
		
		// in java 8
		
		Comparator<Integer> c2 = (Integer a,Integer b) -> a.compareTo(b);
		
		System.out.println("Result of comapartor using lambda " + c2.compare(13, 13));
		
		Comparator<Integer> c3 = ( a,b) -> a.compareTo(b);
		
		System.out.println("Result of comapartor using lambda " + c3.compare(13, 19));
	}

}
