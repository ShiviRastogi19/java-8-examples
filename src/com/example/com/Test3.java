package com.example.com;

import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("shivani#56");
		sb.append("abc#90");
		sb.append("shivani#16");
		sb.append("abc#86");

		String str = sb.toString();

		String s[] = str.split("#");

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			String numberOnly = s[i].replaceAll("[^0-9]", "");
			String nameOnlly = s[i].replaceAll("[0-9]", "");
			System.out.println(numberOnly.length());
			System.out.println("numberOnly : " + numberOnly);
			System.out.println("nameOnlly : " + nameOnlly);

			if (numberOnly.length() < 1) {
				numberOnly = "0";
			}
			else if (nameOnlly.length() < 1){
				nameOnlly = "abc";
			}
			if (hm.containsKey(nameOnlly)) {
				int text = hm.get(nameOnlly);
				hm.put(nameOnlly, Integer.parseInt(numberOnly) + text);
			} else {
				hm.put(nameOnlly, Integer.parseInt(numberOnly));
			}

		}

		System.out.println(hm);
	}

}
