package s096;

import java.util.*;


public class SingleChar {
	public TreeSet<Character> getSinglechar(String s) {

		TreeSet<Character> ts = new TreeSet<>();
		for (int i = 0; i < s.length(); i++) {
			ts.add(s.charAt(i));
		}

		return ts;

//		Arrays.sort(c);
//		List<Character> al = new ArrayList<>();
//		al.add(c[0]);
//		for (int i = 1; i < s.length(); i++) {
//
//			if (c[i] == c[i - 1]) {
//				continue;
//			} else {
//				al.add(c[i]);
//			}
//		}
//		return al;
	}

}
