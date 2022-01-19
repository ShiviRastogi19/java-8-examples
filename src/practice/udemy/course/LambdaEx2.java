package practice.udemy.course;

public class LambdaEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prior Java 8
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside Runnable run() method using legacy approach.");
			}
		};
		
		new Thread(r1).start();
		
		Runnable r2 = () -> System.out.println("inside Runnable run() method using lambda approach.");
		
		new Thread(r2).start();
		
		new Thread(() -> System.out.println("inside Runnable run() method using lambda approach 2.")).start();
	}

}
