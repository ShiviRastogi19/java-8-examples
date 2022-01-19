package coding.exercise.harman;

public class Test {

	public static void main(String[] args) {
		System.out.println("For ABCABA " + checkStrPallindrome("ABCABA"));

	}
	public static boolean checkStrPallindrome(String str) {
		boolean flag = true;
		
		int n = str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i) != str.charAt(n-i-1)) {
				flag = false;
				break;
			}
		}
		
		return flag;
	}

}
