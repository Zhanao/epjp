package s096;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SingleChar {
	public List<Character> getSinglechar(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		List<Character> al = new ArrayList<>();
		al.add(c[0]);
		for (int i = 1; i < s.length(); i++) {

			if (c[i] == c[i - 1]) {
				continue;
			} else {
				al.add(c[i]);
			}
		}
		return al;
	}
	

}
