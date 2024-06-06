package interview.ques.infogain;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class A{
	
	public void m1() throws IOException {
		throw new IOException();
	}
}

class B{
	
	public void m1() throws IOException, ClassNotFoundException {
		throw new ClassNotFoundException();
	}
}

public class Ex2 {

	public static void main(String[] args) {
		
		/*
		 * B b = new B(); try { b.m1(); } catch (Exception e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); } System.out.println("HHH");
		 */
		
		
		List<Integer> list = Arrays.asList(1,2,7,-6,null,9,null,null);
		
		/*
		 * Collections.sort(list, (a,b) -> { if(a != null && b != null) { if(a > b) {
		 * return 1; } else if(a == b) { return 0; } else { return -1; } } else { return
		 * -1;} });
		 * 
		 * System.out.println(list);
		 */
		
		
		List<Integer> result = list.stream()
	            .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
	            .collect(Collectors.toList());
		
		System.out.println(result);
		
		
	}
}
