package com.example.com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test4 {

	public static void main(String[] args) {
		String str = "asfgbcbqwae";
		int n = str.length();
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j <= n; j++) {
				System.out.println(str.substring(i, j));
			}
		}
		
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"A");
		hm.put(2,"B");
		hm.put(3,"C");
		
		/*hm.entrySet().stream()
					 .map(Entry::getKey)
					 .filter(x -> x%2 ==0)
					 .map(Entry::getValue)
					 .collect(Collectors.toList());*/
		
		
		List<String> t = hm.entrySet().stream()
					 .filter(x -> x.getKey() % 2 == 0)
					 .map(Map.Entry :: getValue)
					 .collect(Collectors.toList());
		
		System.out.println(t);

	}

}
