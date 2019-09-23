package s066b;

public class Consulente extends Persona{
	private int pagagiorno;
	private String ruolo;
	
//	public Consulente(String nome, String cognome) {
//		this("",nome, cognome, 0);
//	}

	public Consulente(String ruolo, String nome, String cognome, int pagagiorno) {
		super(nome, cognome);
		this.pagagiorno = pagagiorno;
		this.ruolo=ruolo;
	}
	public String getNamec() {
		String c=ruolo+": "+super.nome+" "+super.cognome+" ";
		
		return c;
		
	}
	public int getPagagiorno() {
		return pagagiorno;
	}
	@Override
	public String toString() {
		return ruolo+": "+super.toString() + " paga giornaliera " + pagagiorno;
	}
	



}
