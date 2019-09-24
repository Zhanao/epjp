package s091;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0;

        // try-with-resources, mi auto chiude scan anche se c'è eccezione
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextDouble()) {
                    result += scanner.nextDouble();
                } else {
                    System.out.println("Bad input, discarded: " + scanner.next());
                }
            }
        }

        System.out.println("Total is " + result);
    }
}
