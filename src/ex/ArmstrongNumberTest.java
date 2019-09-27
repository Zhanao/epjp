package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongNumberTest {

	@Test
	void armstrongNumberTure() {
		boolean actual = ArmstrongNumber.armstrongCalculator(153);
		
        assertThat(actual, is(true));
	}
	
	@Test
	void armstrongNumberFalse() {
		boolean actual = ArmstrongNumber.armstrongCalculator(253);
		
        assertThat(actual, is(false));
	}
	
	@Test
	void armstrongNumberNegative() {
		int value = -253;
		IllegalArgumentException exc = assertThrows(IllegalArgumentException.class, () -> ArmstrongNumber.armstrongCalculator(value));
		
		assertThat(exc.getMessage(), is("The number " + value + " is negative, hence cannot be an Armstrong number."));
	}

}
