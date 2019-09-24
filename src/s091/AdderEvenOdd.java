package s091;

import java.util.Scanner;

public class AdderEvenOdd {
	public static void main(String[] args) {
		int result = 0;
		System.out.println("Please, enter a few numbers");

		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNextInt()) {
				int value = scanner.nextInt();// hasNext ritorna un booleano, mi chiede se c'è qualcosa
				if (value == 0) { //se diaciamo next legge la stringa, nextInt legge l'intero
					System.out.println("The number is 0 and is neither even or odd.");
				} else if (value % 2 == 0) {
					System.out.println("The number " + value + " is even.");
					result += value;
				} else if (value % 2 != 0) {
					System.out.println("The number " + value + " is odd.");
					result += value;
				}
			}
		}
		System.out.println("Is not a number, and the sum is: " + result + ".");
	}
}
