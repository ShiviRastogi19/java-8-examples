package learn.fuctional.interfaces;

public class FunctioanlInterfaceEx {

	public static void main(String[] args) {
		FunctioanlInterfaceEx fi = new FunctioanlInterfaceEx();
		fi.printForm(() -> System.out.println("Printing form"));
		Printable.printColor();

	}
	
	public void printForm(Printable p) {
		p.print();
	}

}
