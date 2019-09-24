package s066c;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Orco mankrik = new Orco("Ogrimar", "Mankrik", 180, 40);
		Orco grommash = new Orco("Hellscream", "Grommash", 190, 30);
		Umano anduin = new Umano("Wrynn", "Anduin", 100, 60);
		Umano jaina = new Umano("Proudmoore", "Jaina", 80, 80);
		Personaggio[] pers = new Personaggio[4];
		pers[0] = mankrik;
		pers[1] = grommash;
		pers[2] = anduin;
		pers[3] = jaina;
		System.out.println("Ecco i combattenti dell'arena:");
		for (Personaggio p : pers) {
			System.out.println(p);
		}

		Personaggio[] select = new Personaggio[2];
		System.out.println("Scegli i due combattenti da 1 a 4:");
		try (Scanner scan = new Scanner(System.in)) {
			int i=0;
			
			while(i<2) {
				int s=scan.nextInt();
			if (s>=1&&s<=4) {

				select[i] = pers[s-1];	
				i++;
			}else {
			System.out.println("Ci spiace ma per adesso ci sono solo questi personaggi, scegli tra 1 e 4");	
			}
			}
			
		}

		System.out.println("I due guerrieri selezionati sono:");

		for (Personaggio p : select) {
			System.out.println(p.getClan() + " " + p.getName());
		}

		System.out.println("Che abbia inizio il combattimento!");

		int vita1 = select[0].getPuntivita();
		int vita2 = select[1].getPuntivita();
		int[] atk = new int[2];
		int[] dif = new int[2];
		for (int i = 0; i < atk.length; i++) {
			if (select[i] instanceof Orco) {
				atk[i] = 0;
				Orco o = (Orco) select[i];
				dif[i] = o.getDifesa();
			} else {
				Umano u = (Umano) select[i];
				atk[i] = u.getAttacco();
				dif[i] = 0;
			}

		}

		int danni;
		while (true) {
			danni = select[0].Combattere(vita1, vita2, atk[0], dif[1]);
			System.out.println(
					select[0].getName() + " attacca " + select[1].getName() + " provocando " + danni + " danni!");
			vita2 = vita2 - danni;
			if (vita2 <= 0) {
				System.out.println(select[1].getName() + " e' esausto");
				System.out.println(select[0].getName() + " ha vinto!");
				break;
			}
			danni = select[1].Combattere(vita1, vita2, atk[1], dif[0]);
			System.out.println(
					select[1].getName() + " attacca " + select[0].getName() + " provocando " + danni + " danni!");
			vita1 = vita1 - danni;
			if (vita1 <= 0) {
				System.out.println(select[0].getName() + " e' esausto");
				System.out.println(select[1].getName() + " ha vinto!");
				break;
			}
		}

	}

}
