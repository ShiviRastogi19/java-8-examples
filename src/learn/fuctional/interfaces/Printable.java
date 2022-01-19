package learn.fuctional.interfaces;

@FunctionalInterface
public interface Printable {
	
	void print();
	static void printColor() {
		System.out.println("Printing color copy.");
	}
}
