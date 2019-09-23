package s066Esempio;

public class Moto extends Veicolo {
	
	@Override
	public String sterza(int gradi) {
		double piega = gradi * 0.75;
		return "La moto sterza di " + gradi + " gradi e si piega di " + piega + " gradi.";
	}
	
	
}

