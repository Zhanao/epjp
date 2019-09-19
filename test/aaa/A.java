package aaa;

public class A {
	// scivo main, e schiaccio ctrl+space
	public static void main(String[] args) {
		System.out.print("ciao");
	
		f(); // non va perche f() è un metodo di istanza e ha bisogno di un oggetto: dovremmo definire un oggetto di tipo A,
		// oppure rendo f() statico : public static int f()
	
	}
	
	public int f() {
		return 3;
	}

}
