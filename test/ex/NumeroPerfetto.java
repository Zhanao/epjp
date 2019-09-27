package ex;

public class NumeroPerfetto {

	public Perfetto numPerfetto(int n) {

		int sum = 0;

		for (int i = 1; i < n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}

		}
	

		if (sum == n) {
			return Perfetto.perfetto;
		} else if (sum > 0) {
			return Perfetto.ABBONDANTE;
		} else {
			return Perfetto.difettivo;
		}

	}
}
