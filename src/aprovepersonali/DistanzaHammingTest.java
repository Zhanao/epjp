package aprovepersonali;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistanzaHammingTest {

	@Test
	void hammingvera() {

		DistanzaHamming dh= new DistanzaHamming();
		String s1= "2143896";
		String s2=  "2233796";
		assertThat(dh.distanzaHamming(s1, s2), is(3));
	}
	
//	@Test
//	void hammingEccezione() {
//
//		DistanzaHamming dh= new DistanzaHamming();
//		String s1= "21438961";
//		String s2=  "2233796";
//		assertThrows(expectedType, executable)
//	}

}
