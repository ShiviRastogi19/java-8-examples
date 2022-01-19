package learn.java.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaBasics {
	public void method(Object obj) {
		System.out.println("Object");
	}

	public void method(String str) {
		System.out.println("String");
	}

	public static void main(String... arg) {

		new JavaBasics().method(null);
		new JavaBasics().method("hello");
		new JavaBasics().method(1);

		String str = new String("Hello");
		String s = "Hello";
		String str1 = str.intern();
		System.out.println(s == str1);

		HashMap<String, Integer> map = new HashMap<>();

		// Add elements to the map
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 30);

		List<String> listOfKeys = map.keySet().stream().collect(Collectors.toList());

		// Java 8 code to convert map values to list
		ArrayList<Integer> listOfValues = map.values().stream().collect(Collectors.toCollection(ArrayList::new));

		System.out.println("The Keys of the Map are " + listOfKeys);

		System.out.println("The Values of the Map are " + listOfValues);

		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

		// Creating an ArrayList of Entry objects
		ArrayList<Map.Entry<String, Integer>> listOfEntry = new ArrayList<Entry<String, Integer>>(entrySet);

		System.out.println(listOfEntry);
	}

}
