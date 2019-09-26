package s105;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StringModeTest {

	@Test
	void testGetSimpleCharListPlain() {
        String actual = StringMode.getString(StringMode.getSimpleCharList("acbccazz"));

        assertThat(actual, is("abcz"));
	}

	@Test
	void testGetSimpleCharListPlainFromTree() {
        String actual = StringMode.getStringFromTree(StringMode.getSimpleCharSet("acbccazz"));

        assertThat(actual, is("abcz"));
	}
}
