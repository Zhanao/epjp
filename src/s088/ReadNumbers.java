package s088;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/cicciopasticcio/Numbers.txt");
		
		try(Scanner scanner = new Scanner(file)) {
			for (int i = 0; scanner.hasNext(); i++) {
				String reader = scanner.next();
				System.out.println("The scanned value at line " + (i + 1) + " is : " + reader);					
			}
//			while (scanner.hasNext()) {
//				String reader = scanner.next();
//				System.out.println("The scanned value is: " + reader);	
//			}
		}
		
		System.out.println("This is the whole file.");
	}
}
