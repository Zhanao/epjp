package s088;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadNumbers {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("/cicciopasticcio/Numbers.txt");
		
		try(Scanner scanner = new Scanner(file)) {
			
		}
		
		System.out.println("This is the whole file.");
		
		
//		File f = new File("/tmp/Numbers.txt");
//
//		BufferedReader br;
//		try {
//			br = new BufferedReader(new FileReader(f));
//			String line = br.readLine();
//			System.out.println(">" + line + "<");
//
//			br.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
