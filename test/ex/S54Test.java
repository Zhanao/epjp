package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S54Test {

    @Test
    void checkSignPositive() {
        String actual = S54.checkSign(42);

        assertThat(actual, is("positive"));
    }

    @Test
    void checkSignNegative() {
        String actual = S54.checkSign(-42);

        assertThat(actual, is("negative"));
    }

    @Test
    void checkSignZero() {
        String actual = S54.checkSign(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void isOddTrue() {
        boolean actual = S54.isOdd(19);

        assertThat(actual, is(true));
    }

    @Test
    void isOddFalse() {
        boolean actual = S54.isOdd(-12);

        assertThat(actual, is(false));
    }

    @Test
    void asWordZero() {
        String actual = S54.asWord(0);

        assertThat(actual, is("zero"));
    }

    @Test
    void asWordOther() {
        String actual = S54.asWord(42);

        assertThat(actual, is("other"));
    }

    @Test
    void voteLowA() {
        char actual = S54.vote(90.01);

        assertThat(actual, is('A'));
    }

    @Test
    void voteTopB() {
        char actual = S54.vote(90);

        assertThat(actual, is('B'));
    }
    
    @Test
    void voteTopA() {
        char actual = S54.vote(90.1);

        assertThat(actual, is('A'));
    }

    @Test
    void isLeapTrue() {
        boolean actual = S54.isLeapYear(2020);

        assertThat(actual, is(true));
    }
    
    @Test
    void isLeapTrue2() {
        boolean actual = S54.isLeapYear(1700);

        assertThat(actual, is(false));
    }
    
    @Test
    void isLeapTrueMillenium() {
        boolean actual = S54.isLeapYear(2000);

        assertThat(actual, is(true));
    }

    @Test
    void isLeapFalse() {
        boolean actual = S54.isLeapYear(1900);

        assertThat(actual, is(false));
    }

    @Test
    void sortPlain() {
        int[] actual = S54.sort(3, 2, 1);

        assertThat(actual.length, is(3));
        assertThat(actual[0], is(1));
        assertThat(actual[1], is(2));
        assertThat(actual[2], is(3));
    }
    
    @Test
    void sortPlainEqual() {
        int[] actual = S54.sort(3, 3, 1);

        assertThat(actual.length, is(3));
        assertThat(actual[0], is(1));
        assertThat(actual[1], is(3));
        assertThat(actual[2], is(3));
    }
    
    @Test
    void sortPlainEqualSecond() {
        int[] actual = S54.sort(3, 1, 3);

        assertThat(actual.length, is(3));
        assertThat(actual[0], is(1));
        assertThat(actual[1], is(3));
        assertThat(actual[2], is(3));
    }
}
