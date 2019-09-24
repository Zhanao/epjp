package s087;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteHello {
    public static void main(String[] args) {
        File f = new File("/tmp/hello.txt"); //se non si ha la cartella tmp bisogna crearla così può scrivere il file hello.txt(ma va?)

        try {
            PrintWriter pw = new PrintWriter(new FileWriter(f));
            pw.println("hello");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
