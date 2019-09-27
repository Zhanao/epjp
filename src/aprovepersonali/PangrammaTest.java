package aprovepersonali;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PangrammaTest {

	@Test
	void pangrammaTrue() {
		String s= "The quick brown fox jumps over the lazy dog";
		Pangramma pm=new Pangramma();
		assertTrue(pm.pangram(s));
	}
	
	@Test
	void pangrammaFalse() {
		String s= " dog";
		Pangramma pm=new Pangramma();
		assertFalse(pm.pangram(s));
	}

}
