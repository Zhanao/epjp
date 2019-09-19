package ex;

public class S55 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		long summation = 0;

		while (first <= last) {
			summation = summation + first;
			first = first + 1;
		}

		return summation;
	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		long summation = 0;

		while (first <= last) {
			if (first % 2 == 0) {
				summation = summation + first;
				first = first + 2;
			} else {
				first = first + 1;
				if (first % 2 == 0) {
					summation = summation + first;
					first = first + 2;
				}

			}
		}

		return summation;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		long fact = 1;
		if (value == 0) {
			fact = 1;
		}

		if (value < 0) {
			fact = 0;
		}

		else {
			while (value > 0) {
				fact = value * fact;
				value = value - 1;
			}
		}
		return fact;

	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		long coniglietti = 1;
		if (value < 0) {
			coniglietti = -1;
		}

		else {
			long[] conigliettiArray = new long[value + 1];

//    	if (value < 0) {
//    		coniglietti = -1;
//    	}

			if (value == 0) {
				conigliettiArray[0] = 0;
				coniglietti = 0;
			}

			if (value == 1) {
				conigliettiArray[0] = 0;
				conigliettiArray[1] = 1;
				coniglietti = 1;
			}

			if (value > 1) {
				conigliettiArray[0] = 0;
				conigliettiArray[1] = 1;

				for (int i = 2; i < conigliettiArray.length; i++) {
					conigliettiArray[i] = conigliettiArray[i - 1] + conigliettiArray[i - 2];
				}
				coniglietti = conigliettiArray[value];
			}
		}

		return coniglietti;

	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		if (value <= 0 || value > 100) {
			int[][] result = new int[1][1];
			if (value < 0 || value > 100) {
				result[0][0] = -1;
				return result;
			}

			result[0][0] = 0;
			return result;
		} else {
			int[][] result = new int[value][value];

			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = (i + 1) * (j + 1);
				}
			}
			return result;
		}

	}
}
