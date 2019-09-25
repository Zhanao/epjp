package s105;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class StringMode {
	public static void main(String[] args) {
		String string = "ottone";
		System.out.println(getSimpleCharList(string));
		System.out.println(getSimpleCharSet(string));
//		System.out.println("Please insert a string:");
//		
//        Scanner scanner = new Scanner(System.in);
//        scanner.close();
//		System.out.println("The listed characters without duplicates is:" + scanner);
	}
	
	public static List<Character> getSimpleCharList(String s) {
		List<Character> simpleCharList = new ArrayList<>();		
		for (int i = 0; i < s.length(); i++) {
			simpleCharList.add(s.charAt(i));
		}
		
		for (int i = 0; i < simpleCharList.size(); i++) {
			for(int j = i + 1; j <= simpleCharList.size(); j++ ) {
				if ( j == simpleCharList.size() ) {
					break;
				} else if (simpleCharList.get(i) == simpleCharList.get(j)) {
					simpleCharList.remove(j);
				} else { 
					continue; }
			}
		}
		return simpleCharList;
	}
	
	public static TreeSet<Character> getSimpleCharSet(String s) {
		List<Character> simpleCharList = new ArrayList<>();		
		for (int i = 0; i < s.length(); i++) {
			simpleCharList.add(s.charAt(i));
		}
		
		TreeSet<Character> simpleCharListSet = new TreeSet<>(simpleCharList);
		return simpleCharListSet;
	}
	
//	public static String getSimpleCharList(List<Character> list) {
//		String 		
//		for (int i = 0; i < s.length(); i++) {
//			simpleCharList.add(s.charAt(i));
//		}
//		
//		for (int i = 0; i < simpleCharList.size(); i++) {
//			for(int j = i + 1; j <= simpleCharList.size(); j++ ) {
//				if ( j == simpleCharList.size() ) {
//					break;
//				} else if (simpleCharList.get(i) == simpleCharList.get(j)) {
//					simpleCharList.remove(j);
//				} else { 
//					continue; }
//			}
//		}
//		return simpleCharList;
//	}

}
