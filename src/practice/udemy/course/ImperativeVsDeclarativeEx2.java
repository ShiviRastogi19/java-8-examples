package practice.udemy.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ImperativeVsDeclarativeEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		List<Integer> intList = Arrays.asList(1,2,3,4,5,3,3,3,5,4,8,9,6,8,8,8,9);
		//Imperative Style
		
		List<Integer> uniqueList = new ArrayList<>();
		
		Iterator<Integer> it = intList.iterator();
		while(it.hasNext()) {
			int item = it.next();
			if(!uniqueList.contains(item)) {
				uniqueList.add(item);
			}
		}
		
		System.out.println("Unique List using imparative style " + uniqueList);
		
		//Declarative style
		
		List<Integer> uniqueList1 = intList.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Unique List using declarative style " + uniqueList1);
	}

}
