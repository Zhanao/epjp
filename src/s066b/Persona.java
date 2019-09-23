package s066b;

public class Persona {
	
	protected String nome;
	protected String cognome;
	
	public Persona(String n, String c) {
		this.cognome = c;
		this.nome = n;
	}

	public String toString() {
		return cognome+ " " + nome;
	}
}

