package s090;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");
        double result = 0;

        Scanner scanner = new Scanner(System.in); //il System.in prende i valori da tastiera
        while (scanner.hasNext()) { //hasNext prende il valore successivo
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());
            }
        } //per terminare il programma diamo il ctrl+Z, se fossimo sotto Unix diamo il ctrl+C
        scanner.close(); // see try-with-resources
        System.out.println("Total is " + result);
    }
}
