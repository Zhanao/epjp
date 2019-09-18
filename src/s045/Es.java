package s045;

public class Es {
    final static int diff = 'a' - 'A';


    public static void main(String[] args) {
        exercise("Bob");
        exercise("ciAo");
        
        // Es es = new Es(); //per creare l'oggetto Es

        System.out.println("My toUpper(): " + toUpper("Bob")); //per essere pignolo bisogna scrivere Es.toUpper("Bob")
    // se togliamo lo static allora dobbiamo scrivere System.out.println("My toUpper(): " + es.toUpper("Bob"));
    }

    public static String toUpper(String s) {//se tolgo 'static' è diventato di istanza
    	if (s == null) {
    		return null;
    	}
    	//questo 'if' serve per controllare che la stringa non sia nulla così da passare il test
    	
    	StringBuilder sb = new StringBuilder(s.length()); //facciamo così per non creare altre stringhe e quindi non allochiamo spazio per nulla

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.append((char) (cur - diff)); //qua serve specificare il (char) per convertire il numero in carattere
            } else {
                sb.append(cur);
            }
        }

        return sb.toString();
    }

    public static void exercise(String sample) {
        System.out.println(sample + " to uppercase and lowercase");
        for (int i = 0; i < sample.length(); i++) {
            char cur = sample.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                System.out.print((char) (cur - diff));
            } else {
                System.out.print(cur);
            }
        }

        System.out.print(", ");

        for (int i = 0; i < sample.length(); i++) {
            char cur = sample.charAt(i);
            if (cur >= 'A' && cur <= 'Z') {
                System.out.print((char) (cur + diff));
            } else {
                System.out.print(cur);
            }
        }

        System.out.println();
    }
}
