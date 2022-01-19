package coding.exercise.harman;

import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		String note = "aacc";
		String magazine = "bbccaa";
		System.out.println("" + validateNote(note,magazine));
	}
	public static boolean validateNote(String note,String magazine) {
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<magazine.length();i++) {
			char ch = magazine.charAt(i);
			if(hm.containsKey(ch)) {
				int count = hm.get(ch);
				hm.put(ch, count+1);
			}
			else {
				hm.put(ch, 1);
			}
		}
		
		for(int i=0;i<note.length();i++) {
			char ch = note.charAt(i);
			if(hm.containsKey(ch)) {
				int val = hm.get(ch);
				if(val < 1) {
					return false;
				}
				else {
					hm.put(ch,val-1);
				}
			}else {
				return false;
			}
		}
		return true;
	}
	

}
