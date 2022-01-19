package interview.ques.infogain;

public class Ex1 {

	public static void main(String[] args) {
		String s1 = "Shivani";//new String("Shivani");
		String s2 = "Shivani";//new String("Shivani");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));  // if two objects are equal by using equals method then 
											// their hashcode will be same, vice-versa is not true
		
		
		try {
			throw new Error();
		}
		catch(Throwable e) {
			System.out.println("Exception Caught");
		}

	}

}
