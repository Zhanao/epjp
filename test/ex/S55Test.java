package ex;

//import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S55Test {

    @Test
    void sumPositive() {
        long actual = S55.sum(1, 3);

        assertThat(actual, is(6L));
    }

    @Test
    void sumNegPos() {
        long actual = S55.sum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void sumSingle() {
        long actual = S55.sum(1003, 1003);

        assertThat(actual, is(1003L));
    }

    @Test
    void sumEmpty() {
        long actual = S55.sum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumPositive() {
        long actual = S55.evenSum(1, 3);

        assertThat(actual, is(2L));
    }

    @Test
    void evenSumPositiveLonger() {
        long actual = S55.evenSum(1, 8);

        assertThat(actual, is(20L));
    }

    
    @Test
    void evenSumNegPos() {
        long actual = S55.evenSum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumSingle() {
        long actual = S55.evenSum(1002, 1002);

        assertThat(actual, is(1002L));
    }

    @Test
    void evenSumEmpty() {
        long actual = S55.evenSum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void factorialFour() {
        long actual = S55.factorial(4);
        
        assertThat(actual, is(24L));
    }

    @Test
    void factorialNegative() {
        long actual = S55.factorial(-4);
        
        assertThat(actual, is(0L));
    }

    @Test
    void fibonacci() {
        long actual = S55.fibonacci(8);
        
        assertThat(actual, is(21L)); //si mette L perchè è un long
    }
    
    @Test
    void fibonacciNeg() {
        long actual = S55.fibonacci(-2);
        
        assertThat(actual, is(-1L)); //si mette L perchè è un long
    }
    
    @Test
    void fibonacciOver() {
        long actual = S55.fibonacci(200);
        
        assertThat(actual, is(-1L)); //si mette L perchè è un long
    }
    
    @Test
    void fibonacciLimit() {
        long actual = S55.fibonacci(50);
        
        assertThat(actual, is(12586269025L)); //si mette L perchè è un long
    }

    @Test
    void fibonacciZero() {
        long actual = S55.fibonacci(0);
        
        assertThat(actual, is(0L)); //si mette L perchè è un long
    }
    
    @Test
    void fibonacciOne() {
        long actual = S55.fibonacci(1);
        
        assertThat(actual, is(1L)); //si mette L perchè è un long
    }
    
    @Test
    void multiplicationTable() {
    	int[][] actual = S55.multiplicationTable(3);
    	
    	for (int i = 0; i < 3; i++) {
        	for (int j = 0; j < 3; j++) {
    	assertThat(actual[i][j], is((i + 1) * (j + 1)));
        	}
    	}
    }
    
    @Test
    void multiplicationTableNeg() {
    	int actual = S55.multiplicationTable(-1)[0][0];

    	assertThat(actual, is(-1));

    }
    
    @Test
    void multiplicationTableZero() {
    	int actual = S55.multiplicationTable(0)[0][0];

    	assertThat(actual, is(0));

    }
    
    @Test
    void multiplicationTableOver() {
    	int actual = S55.multiplicationTable(200)[0][0];
    	
    	assertThat(actual, is(-1));

    }

}


