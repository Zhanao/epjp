package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		String segno;
		if (value > 0) {
			segno = "positive";
		} else if (value < 0) {
			segno = "negative";
		} else {
			segno = "zero";
		}
		return segno;
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 0) {
			return false;
		} else {
			return true;
		}

	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		String word;
		switch (value) {
		case 0:
			word = "zero";
			break;

		case 1:
			word = "one";
			break;

		case 2:
			word = "two";
			break;
		case 3:
			word = "three";
			break;
		case 4:
			word = "four";
			break;
		case 5:
			word = "five";
			break;
		case 6:
			word = "six";
			break;
		case 7:
			word = "seven";
			break;
		case 8:
			word = "eight";
			break;
		case 9:
			word = "nine";
			break;
		default:
			word = "other";
			break;
		}
		return word;
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {
		char c;
		if (percentile <= 50) {
			c = 'F';
		} else if (percentile <= 60) {
			c = 'E';
		} else if (percentile <= 70) {
			c = 'D';
		} else if (percentile <= 80) {
			c = 'C';
		} else if (percentile <= 90) {
			c = 'B';
		} else {
			c = 'A';
		}
		return c;
	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			return true;
		}
		return false;
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		if (a > b) {
			if (b > c) {
				result[0] = c;
				result[1] = b;
				result[2] = a;
			} else {
				result[0] = b;
				result[1] = c;
				result[2] = a;
			}
		} else if (a < b){
			if (a > c) {
				result[0] = c;
				result[1] = a;
				result[2] = b;
			} else if(a < c) {
				if (c < b) {
					result[0] = a;
					result[1] = c;
					result[2] = b;
				}else {
					result[0] = a;
					result[1] = b;
					result[2] = c;
				}
				
			}
		}else if (a==b){
			if (b > c) {
				result[0] = c;
				result[1] = b;
				result[2] = a;
			}else {
					result[0] = b;
					result[1] = a;
					result[2] = c;
			}
			
		}

		return result;
	}
}
