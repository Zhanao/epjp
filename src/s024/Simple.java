/*
 * A simple Java source file
 */
package s024; //insieme di classi che hanno qualcosa in comune, serve solo per tenere ordinato

import java.lang.Math; // a volte mi serve una classe che appartiene ad un altro package, quindi lo importo
						//in questo caso non serve questa classe, l ho fatto solo a scopo dimostrativo.

/**
 * @author manny
 */
public class Simple {
	public static void main(String[] args) {	//il metodo main definito ed e' la prima operazione che viene eseguita quando facciio partire la classe
		System.out.println(Math.PI);			//il metodo println è invocato
	}											
}

class PackageClass {
	// TBD
}