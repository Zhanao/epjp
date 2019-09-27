package aprovepersonali;

public class Pangramma {
	public boolean pangram(String s) {
		int[] alfabeto = new int[26];
		String sm=s.toUpperCase();
		for (int i = 0; i < sm.length(); i++) {
			if (sm.charAt(i) >= 'A' && sm.charAt(i) <= 'Z') {

				alfabeto[sm.charAt(i) - 'A'] = alfabeto[sm.charAt(i) - 'A'] + 1;
			}
		}
		for (int test : alfabeto) {
			if (test == 0) {
				return false;
			}

		}

		return true;
	}
}
