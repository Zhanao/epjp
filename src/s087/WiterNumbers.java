package s087;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WiterNumbers {
	public static void main(String[] args) {
		
		File dir = new File("/cicciopasticcio");
		
		if (!dir.exists()) {
			if (!dir.mkdir()) {
				System.out.println("It wasn't possible to create the directory.");
				System.exit(-1);
			} else { 
				dir.mkdir();
				File f = new File("/cicciopasticcio/Numbers.txt"); //se non si ha la cartella tmp bisogna crearla così può scrivere il file hello.txt(ma va?)

				try {
	            PrintWriter pw = new PrintWriter(new FileWriter(f));
	            pw.println("12");
	            pw.println("89");
	            pw.println("42");
	            pw.println("horses");
	            pw.println("101");
	            pw.flush();
	            pw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.exit(0);
				
				}
			
			} else {
				System.out.println("The directory does not exists.");
				System.exit(-1);
			}
		
        }
	}
