package s045;

import static org.junit.jupiter.api.Assertions.*; // importa tutti i metodi di tipo assertion da JUnit.
import org.junit.jupiter.api.Assertions; //metodo alternativo di importazione
import org.junit.jupiter.api.Test;

class Esercizios45Test {

	@Test // è una nota che ricorda a JUnit che deve eseguire solo quei metodi con l
			// anotazione test
	void toUpperNull() {
		String result = Esercizios45.toUpper(null);

		assertNull(result); // faccio un asserzione, deve tornarmi null, altrimenti non va bene, assertNull
							// è un metodo (che viene da JUnit che ho importato) che mi controlla che il
							// risultato deve venire nullo.
							// se va tutto bene JUnit non mi dice nulla altrimenti me lo comunica con un
							// errore.

// col import alternativo: Assertion.assertNull(result);		
	}

	@Test
	void toUpperEmpty() {
		String result = Esercizios45.toUpper("");

		Assertions.assertTrue(result.isEmpty());
		
// metodo alternativo: assertTrue(result.isEmpty());   da notare con questo metodo non ho nessun Assertion. prima del metodoto, come se fosse sto
													// metodo sia già presente nella classe Esercizios45Test, in realtà no, perché l'ho importato all'inizio
	}
}
