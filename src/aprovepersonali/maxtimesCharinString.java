package aprovepersonali;
import java.util.Arrays;

public class maxtimesCharinString {
		public static void main (String[] args) {
			String s = "-1554327777";
			maxtimesCharinString p = new maxtimesCharinString();
			System.out.println(p.ripeNum(s));
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
