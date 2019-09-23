package s066b;

public class Dipendente extends Persona {
	private int stipendio;
	private String ruolo;

//	public Dipendente(String nome, String cognome) {
//		this("",nome, cognome, 0);
//	}
//
	public Dipendente(String ruolo,String nome, String cognome, int stipendio) {
		super(nome, cognome);
		this.stipendio = stipendio;
		this.ruolo=ruolo;
		
	}
	public String getNamed() {
		String c=ruolo+": "+super.nome+" "+super.cognome+" ";
		
		return c;
		
	}
	public int getStipendio() {
		return stipendio;
	}
	public String toString() {
		return ruolo+": "+super.toString() + " stipendio " + stipendio;
	}
	


}
