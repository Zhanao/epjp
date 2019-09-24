package s090;

import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        System.out.println("Please, enter a few numbers");//fa comparire su console la scritta
        double result = 0;

        Scanner scanner = new Scanner(System.in);//mi lego scanner allo stream a cui voglio legarmi ovvero la tastiera ovvero System.in
        while (scanner.hasNext()) { 
            if (scanner.hasNextDouble()) {
                result += scanner.nextDouble();
            } else {
                System.out.println("Bad input, discarded: " + scanner.next());
            }// è un loop infinito per fermarlo schiaccio Ctrl+c;
        }
        scanner.close(); // see try-with-resources, se ci fosse un eccezione, il metodo si blocca e torna al chiamante e magari non chiudera mai scan
        System.out.println("Total is " + result);
    }
}
