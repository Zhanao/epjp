package aprovepersonali;


// data una stringa di numeri lo converto in un numero corrispondente di interi
public class parseInt {
	public static void main(String[] args) {
		String s = "-1554327777";
		parseInt p = new parseInt();
		System.out.println("valore numerico in interi: "+ p.parseInto(s));

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

}
