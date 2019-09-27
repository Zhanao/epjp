package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PangramCheckerTest {

	@Test
	void testFalse() {
		boolean actual = PangramChecker.isPangram("AAb Ct");
		
		assertThat(actual, is(false));
	}
	
	@Test
	void testTrue() {
		boolean actual = PangramChecker.isPangram("The Quick Brown Fox Jumps Over the Lazy Dog");
		
		assertThat(actual, is(true));
	}

	@Test
	void testStrangeTrue2() {
		boolean actual = PangramChecker.isPangram("The Quick Brown Fox Jumps@ Over the Lazy Dog");
		
		assertThat(actual, is(true));
	}
	
	@Test
	void testEmpty() {
		boolean actual = PangramChecker.isPangram("");
		
		assertThat(actual, is(false));
	}
	
	@Test
	void testNull() {
		ExceptionInInitializerError exc = assertThrows(ExceptionInInitializerError.class, () -> PangramChecker.isPangram(null));
		
		assertThat(exc.getMessage(), is("The string is null!"));
	}
}
