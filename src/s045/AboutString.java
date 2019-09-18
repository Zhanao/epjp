package s045;

public class AboutString {
    public static void main(String[] args) {
        String s = new String("hello");
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));
        // compare to: differenza numerica tra il primo carattere di ogni parola, se identici
        // passa alla lettera successiva, finchè trova qualche differenza tra i caretteri corrispondenti e fa la differenza, se le parole sono identiche
        // mi torna 0.
        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3); //limite destro escluso
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2));

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty()); //mi trasforma new String (" ") e poi controlla se è vuota

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" ");//fallo a pezzi goni volta che incontra uno spazio, per forza prende una stringa quindi doppio apice.
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); // è un metodo statico
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la l".trim() + "]");//elimina gli spazi bianchi intorno alla stringa
        
        String x = null;	//non mi indirizza a nulla, mi riservo solo la variabile da usare dopo
        System.out.println("Sort of safe toString(): " + String.valueOf(x)); //mi permette di stampare x anche se null, se avessi usato x.toString() java mi tira un eccezione e crusha)
    }
}
