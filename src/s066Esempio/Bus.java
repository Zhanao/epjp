package s066Esempio;

import s066Esempio.Climatizza;

public class Bus extends Veicolo implements Climatizza{
	@Override
    public String climatizza() {
        return "Temperatura 20 gradi";
    }
	
	@Override
	public String sterza(int gradi) {
		int size = 1;
		String pluraliatantum = " corsi";
		if (gradi > 20) {
			size = 2;
			pluraliatantum = pluraliatantum.concat("e.");
		}
		else { 
			pluraliatantum = pluraliatantum.concat("a.");
		}
		
		return "Il Bus sterza di " + gradi + " gradi e occupa " + size + pluraliatantum;
	}
}
