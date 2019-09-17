package s040;

public class esercizio {
	public static void main(String[] args) {

		boolean[] array = { true, false, false };
		System.out.println("versione originale");
		for (boolean b : array) {
			System.out.println(b);
		}
		int i = 0;
		for (;;) {
			if (array[i] == false) {
				array[i] = true;
			}
			i++;
			if (i == 3) {
				break;
			}
		}
		System.out.println("versione cambiata vera");
		for (boolean b : array) {
			System.out.println(b);
		}
		System.out.println("versione cambiata falsa");
		int j = 0;
		for (boolean b : array) {
			if (b == true) {
				array[j] = false;
			}

			System.out.println(array[j]);
			j++;
		}

	}
}
