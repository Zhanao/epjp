package s066c;

public class Orco extends Personaggio {

	private int difesa;

	Orco(String clan, String name, int puntivita, int difesa) {
		super(clan, name, puntivita);
		this.difesa = difesa;
	}

	public String showHP() {
		return "a " + super.getName() + " restano " + super.getPuntivita() + " punti vita!";
	}

	public int getDifesa() {
		return difesa;
	}

	public String toString() { // servira' a stampare tutte le info del personaggio quando faro' il for each
		return "L'orco: " + super.toString() + " con difesa bonus pari a " + difesa;
	}

}
