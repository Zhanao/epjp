package s105;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ex.S56;

class StringModeTest {

	@Test
	void testGetSimpleCharListPlain() {
        String actual = StringMode.getSimpleCharList("abc");

        assertThat(actual, is("abc"));
	}

}
