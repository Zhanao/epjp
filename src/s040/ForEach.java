package s040;

public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[5];
        /* 	prende ogni elemento stringa dell array e le stampa, partendo dal primo String[0]
         	stessa cosa per le boolean. es
         	boolean[] bs = {};
         		for (boolean b : bs) {
        		syso(b);
        		}
        	per ogni loop mi mette in item una copia dell'elemento del array,
        	nel caso non fossero primitive ma reference mi copia l'indirizzo
        	e non una copia del contenuto.	
        		
        		
		*/
        for (String item : array) {
            System.out.println(item);
        }
    }
}


