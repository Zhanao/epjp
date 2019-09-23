package s066a;

public class Moto extends Veicolo{
		String sterza(char c) {
			
			
			if (c=='s') {
				return"gira a sinstra" + " piega di " + "30 gradi";
			}else if (c=='d') {
				return"gira a destra" + " piega di " + "30 gradi";
			}else {
				return"procede dritto"+ " piega di "  + "30 gradi";
			}
			
			
			
		
		}
}
