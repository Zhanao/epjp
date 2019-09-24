package s066c;

public class Umano extends Personaggio {
	private int attacco;

	Umano(String clan, String name, int puntivita, int attacco) {
		super(clan, name, puntivita);
		this.attacco = attacco;
	}

	public String showHP() {
		return "a " + super.getName() + " restano " + super.getPuntivita() + " punti vita!";
	}

	public int getAttacco() {
		return attacco;
	}

	public String toString() { // servira' a stampare tutte le info del personaggio quando faro' il for each
		return "L'umano: " + super.toString() + " con bonus attacco pari a " + attacco;
	}

}
