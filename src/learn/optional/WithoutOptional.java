package learn.optional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WithoutOptional {

	public static Character getNonRepeatedCharacter(String str) {
		Map<Character, Integer> countCharacters = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length() - 1; i++) {
			Character c = str.charAt(i);
			if (!countCharacters.containsKey(c)) {
				countCharacters.put(c, 1);
			} else {
				countCharacters.put(c, countCharacters.get(c) + 1);
			}
		}
		// As LinkedHashMap maintains insertion order, first character with
		// count 1 should return first non repeated character
		for (Entry<Character, Integer> e : countCharacters.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();

		}
		return null;

	}
	
	public static void main(String args[]) {
		Character c = getNonRepeatedCharacter("SASAS");
	    System.out.println("Non repeated character is :"+c.toString());
	}
}
