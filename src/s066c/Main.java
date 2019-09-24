package s066c;

public class Main {

	public static void main(String[] args) {
		int vitaO=100;
		int vitaU=90;
		
		int difO=30;
		int attU=40;
		Orco Urg= new Orco("Urka","Urg",vitaO,difO);
		Umano Mario= new Umano("Rossi","Mario",vitaU,attU);
		
		while(true) {
			if(Urg.Combattere(vitaU, vitaU)>0) {
				vitaU=vitaU-Urg.Combattere(vitaU, vitaU);
			}
			if(Mario.Combattere(vitaO, difO,attU, vitaU)>0) {
				vitaO=vitaO-Mario.Combattere(vitaO, difO,attU, vitaU);
			}
			
			if (vitaO<=0||vitaU<=0) {
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
