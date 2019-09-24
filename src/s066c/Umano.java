package s066c;

public class Umano extends Personaggio{
	private int attacco;

	Umano(String clan, String name, int puntivita, int attacco) {
		super(clan, name, puntivita);
		this.attacco=attacco;
	}
	
public int Combattere(int vitaorco, int dif,int vitaumano, int at) {
		
		int x=(int)(Math.random()*6+1);
		int y=(int)(Math.random()*6+1);
		int esito = (int)(((vitaumano+at)*y-(vitaorco+dif)*x));
	
		
		
		
		
		
		return esito;
		
		
		
	}

}
