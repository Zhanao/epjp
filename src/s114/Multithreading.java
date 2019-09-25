package s114;

public class Multithreading {
    public static void main(String[] args) {
        Runnable runnable = new Runner();

        Thread[] threads = { new Thread(runnable), new MyThread() };
        for (Thread t : threads) {
            t.start();
        }

        System.out.println("Main thread done");// da notare che quando mando in esecuzione viene stampato prima
        //questo che è nel main e poi gli altri. se lancio il programma più volte , stampa in ordine differente 
        // a seconda delle priorità che hanno i 3 threads.
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("The Runner runs");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread runs");
    }
}