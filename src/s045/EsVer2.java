package s045;

public class EsVer2 {
    final static int GAP = 'a' - 'A';

    public static void main(String[] args) {
        exercise("Bob");
        exercise("ciAo");

        System.out.println("My toUpper(): " + toUpper("Bob"));
        System.out.println("My toUpper2(): " + toUpper2("Bob"));
        System.out.println("My toUpper3(): " + toUpper3("Bob"));
        System.out.println("My toUpper4(): " + toUpper4("Bob"));
    }
    
    public static String toUpper(String s) {
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

    public static String toUpper2(String s) {
        StringBuilder sb2 = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
        	char cur = s.charAt(i);
            if ( cur >= 'a' &&  cur <= 'z') {
            	sb2.setCharAt(i, (char) (cur-GAP));
            }
            else {
            	sb2.setCharAt(i, cur);
            }
        }

        return sb2.toString();
    }
    
    public static String toUpper3(String s) {
        StringBuilder sb3 = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
        	char cur = s.charAt(i);
            if ( cur >= 'a' &&  cur <= 'z') {
            	sb3.insert(i, (char) (cur - GAP));
            }
            else { 
            	sb3.insert(i, cur);
            }
        }

        return sb3.toString();
    }
    
    public static String toUpper4(String s) {
        StringBuilder sb4 = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
        	char cur = s.charAt(i);
            if ( cur >= 'a' &&  cur <= 'z') {
            	String x = Character.toString((char) (cur - GAP));
            	sb4.replace(i, i+1, x);
            }
        }

        return sb4.toString();
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
