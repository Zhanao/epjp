package ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PangramChecker {
	
	public static boolean isPangram(String s) {
		if (s == null) {
			throw new ExceptionInInitializerError("The string is null!");
		} 
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) < 97) || (s.charAt(i) > 122)) {
				s = s.replace(s.charAt(i), ' ');
			}
		}
		s = s.replaceAll(" ", "");
		HashSet<Character> treeSet = getSimpleCharSet(s);
		if (treeSet.size() == 26) {
			return true;
		} else {
			return false;
		}
	}
	
	public static HashSet<Character> getSimpleCharSet(String s) {
		List<Character> simpleCharList = new ArrayList<>();		
		for (int i = 0; i < s.length(); i++) {
			simpleCharList.add(s.charAt(i));
		}
		
		HashSet<Character> simpleCharListSet = new HashSet<>(simpleCharList);
		return simpleCharListSet;
	}
	
//	public static String toLowerCase(String s) {
//		final int DIFF = 'a' - 'A'; 
//		String loweredString = "";
//		
//		for (int i = 0; i < s.length(); i++)
//		if ((s.charAt(i) <= 97) && (s.charAt(i) >= 122)) {
//			loweredString.concat(s.charAt(i));
//			
//		} else 
//		
//		return loweredString;		
//	}

}
