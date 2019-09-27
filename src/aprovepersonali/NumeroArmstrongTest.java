package aprovepersonali;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumeroArmstrongTest {

	@Test
	void testNumArmstrong() {
		int ingresso=154;
	NumeroArmstrong na=new NumeroArmstrong();
	assertFalse(na.numArmstrong(ingresso)); 
	
	}
	
	@Test
	void testNumArmstrong1() {
		int ingresso=0;
	NumeroArmstrong na=new NumeroArmstrong();
	assertTrue(na.numArmstrong(ingresso)); 
	
	}

}
