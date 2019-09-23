package s066a;

public class Veicolo {
	private char c;
	
	public Veicolo (char c) {
		this.c = c;
	}

String sterza(char c) {
		
		
		if (c=='s') {
			return"gira a sinstra";
		}else if (c=='d') {
			return"gira a destra";
		}else {
			return"procede dritto";
		}
		
		
		
	
	}
}
