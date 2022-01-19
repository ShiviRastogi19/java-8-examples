package learn.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestExample {

	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Shivani", "Vani", "Ajita", "Mohana", "Shubham");

		System.out.println(listStr.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList()));

	}

}
