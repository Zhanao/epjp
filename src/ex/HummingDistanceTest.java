package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HummingDistanceTest {


	@Test
	void testDNA() {
		int actual = HummingDistance.hummingChecker("ADGTTAGTAA", "ADGTTAGTAA");
		
		assertThat(actual, is(0));
	}
	
	@Test
	void testDifferent() {
		int actual = HummingDistance.hummingChecker("ADGTTAGTAA", "ADGTTAGTA@");
		
		assertThat(actual, is(1));
	}

	@Test
	void testEmpty() {
		int actual = HummingDistance.hummingChecker("", "");
		
		assertThat(actual, is(0));
	}
	
	@Test
	void testNull() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> HummingDistance.hummingChecker(null, null));
		
		assertThat(exc.getMessage(), is("One or both of the string are null"));
	}
	
	
}
