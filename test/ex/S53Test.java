package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class S53Test { // da notare che non c � il main, perch� � nascosto in JUnit

    @Test
    void speedPlain() {
        double actual = S53.speed(100, 9.58);

        assertEquals(actual, 10.438, 0.001);
    }

    @Test
    void speedInfinity() {
        double actual = S53.speed(100, 0);

        assertThat(actual, is(Double.POSITIVE_INFINITY));
    }

    @Test
    void distanceSquareTwo() {
        double actual = S53.distance(1, 10, 2, 9);

        assertEquals(actual, Math.sqrt(2), 0.000_001);
    }

    @Test
    void distanceZero() {
        double actual = S53.distance(27, 42, 27, 42);

        assertThat(actual, is(0.0));
    }

    @Test
    void engineCapacityPlain() {
        double actual = S53.engineCapacity(74, 75, 4);

        assertEquals(actual, 1290.252, 0.001);
    }

    @Test
    void digitSumPositive() {
        int actual = S53.digitSum(123);

        assertThat(actual, is(6));
    }

    @Test
    void digitSumZero() {
        int actual = S53.digitSum(0);

        assertThat(actual, is(0));
    }

    @Test
    void digitSumNegative() {
        int actual = S53.digitSum(-123);

        assertThat(actual, is(6));
    }

}
