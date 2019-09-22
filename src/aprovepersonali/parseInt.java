package aprovepersonali;

import java.util.Arrays;

public class parseInt {
	public static void main(String[] args) {
		String s = "1554327777";
		parseInt p = new parseInt();
		System.out.println("valore numerico da analizzare: "+ p.parseInto(s));
		System.out.println(p.ripeNum(s));
	}

	int parseInto(String s) {
		double sum = 0;
		char c = 'a';
		double n = 0;
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(s.length() - 1 - i);
			if (c == '-') {
				return (int) -sum;

			}
			if (c >= '0' && c <= '9') {
				n = (c - '0') * Math.pow(10, i);
				sum = sum + n;
			} else {
				return 0;
			}

		}
		return (int) sum;
	}
// data una stringa permette di inividuare il carattere piu ripetuto.
	String ripeNum(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		int count = 1;
		int max = 0;
		char cmax = s.charAt(0);
		for (int i = 1; i < c.length; i++) {
			if (c[i] == c[i - 1]) {
				count++;
				if (count > max) {
					max = count;
					cmax = c[i];
				}
			} else {
				count = 1;
			}

		}
		return "il numero piu' ripetuto e' il " + cmax + " che compare " + max + " volte.";

	}

}
