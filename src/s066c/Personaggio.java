package s066c;

public abstract class Personaggio {
	private String clan;
	private String name;
	private int puntivita;

	Personaggio(String clan, String name, int puntivita) {

		this.clan = clan;
		this.name = name;
		this.puntivita = puntivita;
	}

	public int getPuntivita() {
		return puntivita;
	}

	public String getClan() {
		return clan;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return clan + " " + name + " con una vitalita' di " + puntivita;
	}

	public int Combattere(int vita1, int vita2, int atk, int dif) {

		int x = (int) (Math.round((Math.random()) * 5) + 1);
		int y = (int) (Math.random() * 6 + 1);
		int esito = (int) (((vita1 + atk) * x - (vita2 + dif) * y) / 10);

		if (esito < 0) {
			return 0;
		} else {
			return esito;

		}

	}
}
