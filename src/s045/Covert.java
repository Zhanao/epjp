package s045;

public class Covert {
	public static void main(String[] args) {
		String y = "Bob";
		String Up = y;
		String Down = y;

		int diff = 'a' - 'A';

		for (int i = 0; i < y.length(); i++) {
			if ((int) y.charAt(i) >= 'a' && (int) y.charAt(i) <= 'z') {
				//System.out.println( y.charAt(i));
				char u = (char) y.charAt(i);
				char U = (char) (y.charAt(i) - diff);
				Up = Up.replace(u, U);

			} else continue;
		}
		
		for (int i = 0; i < y.length(); i++) {
			if ((int) y.charAt(i) >= 'A' && (int) y.charAt(i) <= 'Z') {
				//System.out.println( y.charAt(i));
				char L = (char) y.charAt(i);
				char l = (char) (y.charAt(i) + diff);
				Down = Down.replace(L, l);

			} else continue;
		}

		System.out.println("The Upper case is : " + Up);
		System.out.println("The Lower case is : " + Down);		
	}

}
