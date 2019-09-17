package s040;

public class For {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Begin block loop " + i);

			if (i == 2) {
				continue; // mi ferma li e torna all'inizio del ciclo
							// e continua normalmente con i=3. Quindi non mi 
							// stampa "End block loop 2".
			}

			System.out.println("End block loop " + i);
		}
	}
}
