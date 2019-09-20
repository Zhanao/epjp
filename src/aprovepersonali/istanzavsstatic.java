package aprovepersonali;

public class istanzavsstatic {
	// scivo main, e schiaccio ctrl+space
	public static void main(String[] args) {
		System.out.print("ciao");
		istanzavsstatic test = new istanzavsstatic();

		System.out.println(test.f()); // scrivere " sysout " e schiacciare ctrl+space

		// dato che f() e' un metodo di istanza e non statico devo per forza definire un
		// oggetto per farlo funzionare
		// oppure in alternativa rendo f() static: public static int (); e per chiamarlo
		// basta scrivere A.f():

//System.out.println( A.f());

	}

	public /* static */ int f() {
		return 12;
	}

}
