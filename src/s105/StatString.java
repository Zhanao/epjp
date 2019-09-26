package s105;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class StatString {
	public static void main(String[] args) {
		String string = "abcbab";
		System.out.println(getStat(string).toString());
	}

	public static TreeSet<Character> getSimpleCharSet(String s) {
		List<Character> simpleCharList = new ArrayList<>();		
		for (int i = 0; i < s.length(); i++) {
			simpleCharList.add(s.charAt(i));
		}
		TreeSet<Character> simpleCharListSet = new TreeSet<>(simpleCharList);
		return simpleCharListSet;
	}
	
	public static char getMode(String s) {
		TreeSet<Character> charTree = getSimpleCharSet(s);
		char mode ='a';	
		int size = getSimpleCharSet(s).size();
		int frequencyModeIndex = getMaxArrayIndex(getFrequencyModeArray(s));
		for (int i = 0; i < size; i++) {
			if (i == frequencyModeIndex) {
				mode = charTree.first();
				break;
			} else {
				charTree.remove(charTree.first());
			}
		}
		return mode;
	}
	
	
	public static int getFrequencyMode(String s) {
		return getMaxArray(getFrequencyModeArray(s));
	}
	
	public static int getElementsNumber(String s) {
		return getSimpleCharSet(s).size();
	}
	
	public static int[] getFrequencyModeArray(String s) {
		TreeSet<Character> charList = getSimpleCharSet(s);
		int size = getSimpleCharSet(s).size();
		int[] charArray = new int[size];
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < s.length(); j++) {
				if (charList.first() == s.charAt(j)) {
					charArray[i]++;
				} else {
					continue;
				}
			}
			charList.remove(charList.first());
		}
		return charArray;
	}
	
	public static int getMaxArray(int[] array) {
		return array[getMaxArrayIndex(array)];
	}
	
	public static int getMaxArrayIndex(int[] array) {
		int max = array[0];
		int app = array[0];
		int maxIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			app = Math.max(max, array[i]);
			if (app > max) {
				max = app;
				maxIndex = i;
			} else {
				continue;
			}
		}
		return maxIndex;
	}
	
	public static Stat getStat(String s) {
		if ( s == null || s.isEmpty()) { throw new IllegalArgumentException("The string should not be empty."); }
		
		char mode = '0';
		int frequency = 0;
		int elementsNumber = 0;

		elementsNumber = getElementsNumber(s);
		frequency = getFrequencyMode(s);
		mode = getMode(s);

		Stat stat = new Stat(mode, frequency, elementsNumber);
		return stat;
		
	}
}
