package s040;

public class DoWhile {
    public static void main(String[] args) {
        boolean condition = false;
        boolean something = true;
// funziona come il while ma in questo caso il programma esegue
// ALMENO UNA VOLTA ciò che c é dentro il loop
        do {
            System.out.println("something is true");

            if (something) {
                condition = false;
            }
        } while (condition);
    }
}
