package aprovepersonali;

import java.util.ArrayList;

public class NumeroArmstrong {

	public boolean numArmstrong(int i) {
		int count = 0;

		int intero = i;
		int modulo = 0;
		ArrayList<Integer> ai = new ArrayList<Integer>();
		while (intero > 0) {
			modulo = intero % 10;
			intero = intero / 10;
			ai.add(modulo);
			count++;

		}

		int sum = 0;
		for (int j = 0; j < ai.size(); j++) {
			sum = sum + (int) Math.pow((double) ai.get(j), (double) count);
		}

		if (sum == i) {
			return true;
		} else {
			return false;
		}

	}

}
