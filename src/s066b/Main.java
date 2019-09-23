package s066b;

public class Main {
	public static void main(String[] args) {
		Dipendente Mario = new Dipendente("Segretario", "Mario", "Rossi", 1600);
		Dipendente Vittorio = new Dipendente("Manager", "Vittorio", "Bianchi", 2400);
		Consulente Luigi = new Consulente("Consulente Accenture", "Luigi", "Pino", 490);
		Consulente Francesca = new Consulente("Consulente Deloitte", "Francesca", "Tomino", 500);

		Persona[] per = new Persona[4];
		per[0] = Mario;
		per[1] = Vittorio;
		per[2] = Luigi;
		per[3] = Francesca;
		for (Persona pers: per) {
			System.out.println(pers);
		}
		for (Persona v : per) {
			if (v instanceof Consulente) {
				Consulente c = (Consulente) v;
				System.out.println(c.getPagagiorno());
			} else if (v instanceof Dipendente) {
				Dipendente c = (Dipendente) v;
				System.out.println(c.getStipendio());
			}

		}

	}
}
