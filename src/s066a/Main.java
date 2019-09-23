package s066a;

import s066a.climatizzabile;
import s066a.Bus;
import s066a.Auto;

public class Main {
	public static void main(String[] args) {
		Veicolo[] veicoli = new Veicolo [3]; //array di veicoli di ogni tipo:polimorfismo
		veicoli[0]= new Auto();
		veicoli[1]= new Bus();
		veicoli[2]= new Moto();
		
		for(Veicolo v:veicoli) {
			System.out.println(v.sterza('s'));
		}
		
		
        climatizzabile[] climatizzati = new climatizzabile [2];
        climatizzati[0] = new Bus();
        climatizzati[1] = new Auto();
//        Bus b=new Bus();
 //       b.changeTemp(24);
        
 //       Auto a=new Auto();
 //       a.changeTemp(5);
        

        for(climatizzabile v: climatizzati) {
            System.out.println(v.changeTemp(25));
        }
        

    }

}
