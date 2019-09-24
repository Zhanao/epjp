package s066c;

public class Orco extends Personaggio{
	
	private int difesa;

	Orco(String clan, String name, int puntivita, int difesa) {
		super(clan, name, puntivita);
		this.difesa=difesa;
	}

	public int Combattere(int vitaorco,int vitaumano) {
		
		int x=(int)(Math.round((Math.random())*5)+1);
		int y=(int)(Math.random()*6+1);
		int esito = (int)((vitaorco*x-vitaumano*y));
		
		return esito;
		
		
		
	}
}
