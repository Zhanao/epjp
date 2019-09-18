package s045;

public class Covert {
	public static void main(String[] args) {
		String y = "Bob";
		String Up = y;
		String Down = y;
		
		int diff = 'a' - 'A';

		for (int i = 0; i < y.length(); i++) {
			if ( y.charAt(i) >= 'a' &&  y.charAt(i) <= 'z') { //avevo messo (char) y.charAt(i) ma non serve perchè converte automaticamente il carattere in numero
				//System.out.println( y.charAt(i));
				char u = (char) y.charAt(i);
				char U = (char) (y.charAt(i) - diff);
				Up.replace(u, U); //avevo messo Up = Up.replace(u, U) ma non serve

			} else continue;
		}
		
		for (int i = 0; i < y.length(); i++) {
			if ( y.charAt(i) >= 'A' &&  y.charAt(i) <= 'Z') { //avevo messo (char) y.charAt(i) ma non serve perchè converte automaticamente il carattere in numero
				//System.out.println( y.charAt(i));
				char L = (char) y.charAt(i);
				char l = (char) (y.charAt(i) + diff);
				Down.replace(L, l);

			} else continue;
		}
		
		
		
		//for (int i = 0; i < y.length(); i++) {
		//	if ((int) y.charAt(i) >= 'a' && (int) y.charAt(i) <= 'z') {
		//		//System.out.println( y.charAt(i));
		//		char u = (char) y.charAt(i);
		//		char U = (char) (y.charAt(i) - diff);
		//		Up = Up.replace(u, U);
//
		//	} else continue;
		//}
		
		//for (int i = 0; i < y.length(); i++) {
		//	if ((int) y.charAt(i) >= 'A' && (int) y.charAt(i) <= 'Z') {
		//		//System.out.println( y.charAt(i));
		//		char L = (char) y.charAt(i);
		//		char l = (char) (y.charAt(i) + diff);
		//		Down = Down.replace(L, l);
//
		//	} else continue;
		//}

		System.out.println("The Upper case is : " + Up);
		System.out.println("The Lower case is : " + Down);		
	}

}
