package s040;

public class es1loop {
	public static void main(String[] args) {
		System.out.println("Valori dell'array");
		
		boolean[] flags = { true, false, false };

		for (boolean b : flags) {
			System.out.println(b);
		}

		System.out.println("Valori cambiati in 'true'");

		for (int i = 0; i < flags.length; i++) {
			if (flags[i] == false) { //la condizione può essere "!flags[i]"
				flags[i] = true;
			} else // non serve
				continue;
		}

		for (boolean b : flags) {
			System.out.println(b);
		}

		System.out.println("Valori cambiati in 'false'");

		for (boolean b : flags) {
			if (b == true) {
				b = false;
				System.out.println(b);
			} else {
				System.out.println(b);
			}
		}
		
		System.out.println("Ristampiamo i valori dell'array, "
				+ "che non sarà cambiato");
		
		for (boolean b : flags) {
			System.out.println(b);
		}
	}

}
