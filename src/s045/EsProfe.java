package s045;

public class EsProfe {
    final static int GAP = 'a' - 'A';

    public static void main(String[] args) {
        exercise("Bob");
        exercise("ciAo");

        System.out.println("My toUpper(): " + toUpper("Bob"));
    }

    public static String toUpper(String s) {
    	if (s == null) {
    		return null;
    	}
    	//questo 'if' serve per controllare che la stringa non sia nulla così da passare il test
    	StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur >= 'a' && cur <= 'z') {
                sb.append((char) (cur - GAP));
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
                System.out.print((char) (cur - GAP));
            } else {
                System.out.print(cur);
            }
        }

        System.out.print(", ");

        for (int i = 0; i < sample.length(); i++) {
            char cur = sample.charAt(i);
            if (cur >= 'A' && cur <= 'Z') {
                System.out.print((char) (cur + GAP));
            } else {
                System.out.print(cur);
            }
        }

        System.out.println();
    }
}