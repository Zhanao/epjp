package s066Esempio;

public class Main {
    public static void main(String[] args) {
        Veicolo[] veicoli = new Veicolo[3];
        
        veicoli[0] = new Macchina();
        veicoli[1] = new Moto();
        veicoli[2] = new Bus();
        

        for(Veicolo veicolo: veicoli) {
            System.out.println(veicolo.sterza(10));
        }
        
        Climatizza[] temperatura = new Climatizza[2];
        temperatura[0] = new Macchina();
        temperatura[1] = new Bus();
        
        for(Climatizza veicolo: temperatura) {
            System.out.println(veicolo.climatizza());
        }
        
//        Climatizza temperaturaMacchina = new Macchina();
//        System.out.println(temperaturaMacchina.climatizza());
//        Climatizza temperaturaBus = new Bus();
//        System.out.println(temperaturaBus.climatizza());

    }
}
