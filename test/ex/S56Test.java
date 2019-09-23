package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S56Test {

    @Test
    void reverseStringPlain() {
        String actual = S56.reverse("abc");

        assertThat(actual, is("cba"));
    }

    @Test
    void isPalindromePlain() {
        boolean actual = S56.isPalindrome("abba");

        assertThat(actual, is(true));
    }
    
    @Test
    void isPalindromePlain2() {
        boolean actual = S56.isPalindrome("acda");

        assertThat(actual, is(false));
    }
    
    @Test
    void isPalindromePlainRadar() {
        boolean actual = S56.isPalindrome("radar");

        assertThat(actual, is(true));
    }
    
    @Test
    void isPalindromePlainRador() {
        boolean actual = S56.isPalindrome("rador");

        assertThat(actual, is(false));
    }


    @Test
    void removeVowelsPlain() {
        String actual = S56.removeVowels("example");

        assertThat(actual, is("xmpl"));
    }
    
    @Test
    void removeVowelsPlainNoCrack() {
        String actual = S56.removeVowels2("example");

        assertThat(actual, is("xmpl"));
    }

    @Test
    void bin2decPlain() {
        int actual = S56.bin2dec("1011");

        assertThat(actual, is(11));
    }
    
    @Test
    void bin2decSVPlain() {
        int actual = S56.bin2decSecondVersion("1011");

        assertThat(actual, is(11));
    }
    
    @Test
    void bin2decNeg() {
        int actual = S56.bin2decDebunk("-1001");

        assertThat(actual, is(-9));
    }
    
    @Test
    void bin2decWord() {
        int actual = S56.bin2decWord("18e7");

        assertThat(actual, is(-1));
    }

    @Test
    void reverseIntArrayPlain() {
        int[] original = new int[] {1, 2, 3};
        int[] actual = S56.reverse(original);

        assertThat(actual.length, is(original.length));
        for(int i = 0; i < original.length; i++) {
            assertThat(actual[i], is(original[original.length - i - 1]));
        }
    }
    
    @Test
    void reverseIntArray() {
        int[] original = new int[] {5, 13, 18, 42};
        int[] actual = S56.reverse(original);

        assertThat(actual[0], is(42));  
    }
    
    @Test
    void reverseIntArrayFor() {
        int[] original = new int[] {5, 13, 18, 42};
        int[] actual = S56.reverse(original);

        for (int i = 0; i < original.length; i++) {
        assertThat(actual[i], is(original[original.length -i -1]));
        }
    }

    @Test
    void averagePlain() {
        double actual = S56.average(new int[] {1, 2, 3});

        assertThat(actual, is(2.0));
    }
    
    @Test
    void averageBilion() {
        double actual = S56.average(new int[] {1000000, 1000000, 1000000, 1000000});

        assertThat(actual, is(1000000.0));
    }

    @Test
    void maxPlain() {
        int actual = S56.max(new int[] {2, 3, 1});

        assertThat(actual, is(3));
    }
    
    @Test
    void maxNeg() {
        int actual = S56.max(new int[] {2, -3, 1});

        assertThat(actual, is(2));
    }
    
    @Test
    void parseIntWord() {
        int actual = S56.parseInt("8099");

        assertThat(actual, is(8099));
    }
    
    @Test
    void parseIntWordNeg() {
        int actual = S56.parseInt("-8099");

        assertThat(actual, is(-8099));
    }
    
    @Test
    void parseIntWordLetters() {
        int actual = S56.parseInt("-8099e");

        assertThat(actual, is(0));
    }
    
    @Test
    void parseIntOptWord() {
        int actual = S56.parseIntOpt("8099");

        assertThat(actual, is(8099));
    }
    
    @Test
    void parseIntWordOptNeg() {
        int actual = S56.parseIntOpt("-8099");

        assertThat(actual, is(-8099));
    }
    
    @Test
    void parseIntWordOptLetters() {
        int actual = S56.parseIntOpt("-8099e");

        assertThat(actual, is(0));
    }
    
	@Test
	void NumberFrequencyPlain() {
		int actual = NumberFrequency.frequency(80982);
		
		assertThat(actual, is(8));
	}

}
