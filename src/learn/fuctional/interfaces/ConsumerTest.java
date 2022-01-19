package learn.fuctional.interfaces;

import java.util.function.Consumer;

class Movie{
	String name;
	public Movie(String name) {
		this.name = name;
	}
}
public class ConsumerTest {
	 
	public static void main(String arr[]) {
		Consumer<Movie> c = m -> System.out.println(m.name+" ready to release.");
		Movie m1 = new Movie("munna bhai");
		c.accept(m1);
		
	}
	
}
