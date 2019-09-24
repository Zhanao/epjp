package s091ex;

import java.util.Scanner;

public class PariDispari {
	public static void main(String[] args) {
		System.out.println("Il programma determina se il valore inserito è pari o dispari");
		System.out.println("Inserire il numero da verificare:");
		try (Scanner scanner = new Scanner(System.in)) {
			while (scanner.hasNext()) { // ha il system in qualcosa da darmi? mi da vero o falso ma non mi tocca lo
										// stream
				if (scanner.hasNextInt()) {
					int n = scanner.nextInt();
					if (n == 0) {
						System.out.println("Ciao");
						break;

					} else if (n % 2 == 0) {
						System.out.println("è pari");
					} else if (n % 2 != 0) {
						System.out.println("è dispari");

					}
				} else {
					System.out.println("Attenzione input deve essere un numero" + " è non la stringa " + scanner.next());
					// scanner.next mi da il valore a cui il puntatore punta e passa al successivo;
					// quindi una volta usato perdo il dato.
					// se avessi usato scanner.next una seconda volta il programma si bloccherebbe perche il token è vuoto, non ho ancora inserito nulla
					// se non avessi chiamato scanner.next il puntatore non avrebe avanzato e il
					// valore rientra nel ciclo while 
					// generando un loop infinito

				}

			}
		}
	}
}
