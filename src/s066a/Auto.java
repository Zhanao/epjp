package s066a;

import s066a.climatizzabile;

public class Auto extends Veicolo implements climatizzabile {
	private int newTemp;
	public Auto(char c) {
		this(c,0);
	}
	public Auto(char c, int n) {
		super(c);
		this.newTemp = n;
		
	}
	
	@Override  // per dire che il metodo non nasce in Auto ma viene da classe superiore oppure da un interfaccia
	public String changeTemp(int newTemp) {
		return "la nuova temperatura è " + newTemp;	
	}


}