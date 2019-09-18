package s045;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsProfeTest {

	//@Test //costrutto uscito con java 5
	//void test() { //test fino a JUnit 3 era obbligatorio, ma ora non lo è più
	//	fail("Not yet implemented");
	//}
	
	@Test
	void testNull() {
		String result = EsProfe.toUpper(null); //EsProfe è la classe del main del codice
		assertNull(result);
	}
	
	@Test
	void testEmpty() {
		String result = EsProfe.toUpper("");
		assertTrue(result.isEmpty());
	}
	
	@Test
	void testBob() {
		String result = EsProfe.toUpper("Bob");
		assertEquals("BOB", result);
	}

}
