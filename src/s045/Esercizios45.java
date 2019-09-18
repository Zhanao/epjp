package s045;

public class Esercizios45 {
	public static void main(String[] args) {
	
	System.out.println( toUpper("BobHÁIh8huS") );
	}
	// toUpper l abbiamo trattato da static, ma se avessimo voluto un
	//metodo di istanza public String toUpper ( String s) {...
	//allora dovrei definire un nuovo oggetto nel main: Esercizio45 es45 = NEW Esercizio45()
	// e nel println dovrei scrivere e45.toUpper
	public static String toUpper ( String s) {
		if (s==null) {	// se non mettessi questa condizione quando definisco sb ho usato s.length causa problemi
			return null; 
		}
		int delta = 'a' - 'A';
		
		StringBuilder sb = new StringBuilder(s.length());
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char c = (char) (s.charAt(i) - delta);
				sb.insert(i,c);
//				String x= Character.toString(c); //toString lo converte in stringa
//				sb.replace(i, i+1, x);
			} else {
				sb.insert(i,s.charAt(i) );
//				String y= Character.toString(s.charAt(i));
//				sb.replace(i, i+1, y);
			}
		
	}
		return  sb.toString(); //toString lo converte in stringa
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
