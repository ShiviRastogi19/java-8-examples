package com.example.com;

public class Test2 {

	public static void main(String[] args) {
		
		int arr[] = new int[]{1,4,2,2,7,1,1,8,9,9,1,4,4};
		/*1,4,2,2
		2,7
		7,1,1
		1,8
		9
		9
		1,4,4 */
		
		int n = 9;
		int sum = 0;
		int tempIndex = 0;
		String str = "";
		for(int j=0;j<arr.length;j++) {
				sum += arr[j];
				str += ""+arr[j];
				if(sum == n) {
					System.out.println(str);
					str = "";
					sum = 0;
					--j;
				}
				else if(sum > n) {
					j++;
					str = "";
					sum = 0;
				}
			}
	}

}
