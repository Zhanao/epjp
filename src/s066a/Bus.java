package s066a;

import s066a.climatizzabile;

public class Bus extends Veicolo implements climatizzabile {
	int newTemp=24;
	
	@Override
	public String changeTemp(int newTemp) {
		return "la nuova temperatura è " + newTemp;	
	}



}
