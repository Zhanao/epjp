package s105;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class StatStringTest {

	@Test
	void testStatStringMode() {
        char actual = StatString.getStat("ababcbz").toMode();

        assertThat(actual, is('b'));
	}
	
	@Test
	void testStatStringModeEmpty() {
        char actual = StatString.getMode("");

        assertThat(actual, is("The string should not be empty."));
	}
	
	@Test
	void testStatStringFrequencyMode() {
        int actual = StatString.getFrequencyMode("ababcb");

        assertThat(actual, is(3));
	}
	
	@Test
	void testStatStringElementsNumber() {
        int actual = StatString.getElementsNumber("ababcb");

        assertThat(actual, is(3));
	}
	
	@Test
	void testStatStringNull() {
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> StatString.getStat(null));
		
		assertThat(exc.getMessage(), is("The string should not be empty."));
	}

}
