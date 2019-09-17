package s045;

public class Esercizios45 {
	public static void main(String[] args) {
	
	System.out.println( toUpper("BobHIh8huS") );
	}
	
	public static String toUpper ( String s) {
		int delta = 'a' - 'A';

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char c = (char) (s.charAt(i) - delta);
				sb.insert(i, c);
			} else {
				sb.insert(i,s.charAt(i) );
	
			}
		
	}
		return  sb.toString();
	}
/*	public static void main(String[] args) {
		int delta = 'a' - 'A';

		String s = "Bscj??DDDsX";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				char c = (char) (s.charAt(i) + delta);
				System.out.print(c);
			} else {
				System.out.print(s.charAt(i));
			}

		}

	}
	*/
}
