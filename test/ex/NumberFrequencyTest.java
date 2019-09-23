package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class NumerFrequencyTest {

	@Test
	void NumberFrequencyPlain() {
		int actual = NumberFrequency.frequency(80982);
		
		assertThat(actual, is(8));
	}
}

