package ex;

public class HummingDistance {

	public static int hummingChecker(String firstString, String secondString) {
		if (firstString == null || secondString == null) {
			throw new IllegalArgumentException("One or both of the string are null");
		}
		if (firstString.length() != secondString.length()) {
			throw new ExceptionInInitializerError("The two strings has to be of equal length!");
		}
			int hummingD = 0;
			for (int i = 0; i < firstString.length(); i++) {
				if (firstString.charAt(i) != secondString.charAt(i)) {
					hummingD++;
				}
			}

			return hummingD;
		
	}

}
