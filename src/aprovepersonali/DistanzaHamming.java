package aprovepersonali;

public class DistanzaHamming {

	public int distanzaHamming(String s1, String s2)  { //creare un eccezione uncked
		if (s1.length() != s2.length()) {
			throw new IllegalArgumentException("lunghezza stringhe differente");
		}
//		Per tirare un eccezione checked		
//		public int distanzaHamming(String s1, String s2) throws Exception {
//			if (s1.length() != s2.length()) {
//				throw new Exception("lunghezza stringhe differente");
//			}

		int count = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {

				count++;

			}

		}

		return count;

	}

}
