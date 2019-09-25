package s091ex;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NumdaFile {
	public static void main(String[] args) {

		File f = new File("/Dev/eclipse/workspace/epjp/src/s091ex/numerib.txt");

		try {
			if (f.exists() == false) {
				PrintWriter pw = new PrintWriter(new FileWriter(f));
				pw.println("1");
				pw.println("c");
				pw.println("23");
				pw.println("2 3"); // lo scan mi rileva 2 numeri: 2 e 3
				pw.println("0");
				pw.println("51"); // non me lo dovrebbe leggere perche dopo lo 0 mi termina tutto
				pw.flush();
				pw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (Scanner sc = new Scanner(f)) {

			while (sc.hasNext()) {
				if (sc.hasNextInt()) {
					int n = sc.nextInt();
					if (n == 0) {
						System.out.println("Ciao");
						break;

					} else if (n % 2 == 0) {
						System.out.println("è pari");
					} else if (n % 2 != 0) {
						System.out.println("è dispari");

					}
				}else {
					System.out.println("Attenzione input deve essere un numero" + " è non la stringa " + sc.next());
				}
			}

		} catch(FileNotFoundException e) {
			System.out.println("file not found: " + e.getMessage());
		}
	}
}
