package s50;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

import s050.Simple;

class SimpleTest {
    @Test
    public void negatePositive() {
        Simple simple = new Simple(); // dato che devo fare un test sul metodo di istanza
        int value = 42;

        int result = simple.negate(value);

        assertThat(result, equalTo(-42));
    }
}
// dovrei fare il test anche sul 0, il massimo valore che posso negare e il valore minimo da rendere positivo