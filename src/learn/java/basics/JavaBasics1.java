package learn.java.basics;

public class JavaBasics1 {
	/*
	 * Input: accounts = [[1,5],[7,3],[3,5]] Output: 10 Explanation: 1st customer
	 * has wealth = 6 2nd customer has wealth = 10 3rd customer has wealth = 8 The
	 * 2nd customer is the richest with a wealth of 10.
	 */

	public static void main(String[] args) {
		int arr[][] = { { 1, 5 }, { 7, 3 }, { 3, 5 } };

		int result = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[0].length; j++) {
				sum += arr[i][j];
			}
			if (sum > result) {
				result = sum;
			}
		}
		System.out.println(result);
	}

}
