package learn.stream.api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice1 {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,11);
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		
		//1. Given a list of integers, find out all the even numbers exist in the list using Stream functions?
		System.out.println("---------------------1---------------------");
		intList.stream()
			.filter(n -> n%2 ==0)
			.forEach(System.out::println);
		
		//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		System.out.println("---------------------2---------------------");
		intList.stream()
			.map(n -> ""+n)
			.filter(str -> str.startsWith("1"))
			.forEach(System.out::println);
		//3. How to find duplicate elements in a given integers list in java using Stream functions?
		System.out.println("---------------------3---------------------");
		HashSet<Integer> set = new HashSet<>();
        myList.stream()
        	.filter(num -> !set.add(num))
        	.forEach(System.out::println);
        //4. Given the list of integers, find the first element of the list using Stream functions?
        System.out.println("---------------------4---------------------");
        myList.stream()
        	.findFirst()
        	.ifPresent(System.out::println);
        //5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println("---------------------5---------------------");
        long n = myList.stream().count();
        System.out.println(n);
        //6. Given a list of integers, find the maximum value element present in it using Stream functions?
        System.out.println("---------------------6---------------------");
        myList.stream()
        		.reduce((x,y) -> x > y ? x : y)
        		.ifPresent(System.out::println);
        /*int max =  myList.stream()
                .max(Integer::compare)
                .get();
        System.out.println(max);*/
        //7. Given a String, find the first non-repeated character in it using Stream functions?
        System.out.println("---------------------7---------------------");
        String input = "Java Hungry Blog Alive is Awesome";

        Character result = input.chars() // Stream of String       
                                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s))) // First convert to Character object and then to lowercase         
                                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) //Store the chars in map with count 
                                .entrySet()
                                .stream()
                                .filter(entry -> entry.getValue() == 1L)
                                .map(entry -> entry.getKey())
                                .findFirst()
                                .get();
        System.out.println(result); 
        
        System.out.println("------------------count repeated numbers in list----------"); 
   
        // we can also use Function.identity() instead of c->c
       Map<Integer ,Long > map = myList.stream()
               .collect(  Collectors.groupingBy(Function.identity() , Collectors.counting())         ) ;


       map.forEach(   (k , v ) -> System.out.println( k + " : "+ v )                    );
	}
	
}
