package s066c;

public abstract class Personaggio {
	private String clan;
	private String  name;
	private int puntivita;
	
	Personaggio(String clan, String name, int puntivita){
		
		this.clan=clan;
		this.name=name;
		this.puntivita=puntivita;
	}
	
	public int getPuntivita(){
		return puntivita;
	}
	
	public int Combattere() {
		int danno = puntivita;
		

		return danno;
		
	}

}
