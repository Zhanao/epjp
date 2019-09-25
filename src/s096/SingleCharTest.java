package s096;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class SingleCharTest {

	@Test
	void singlechar() {
		 String al = new String("abaccsafdafadfzzc");
		 SingleChar c=new SingleChar();
         List<Character> result=c.getSinglechar(al);
		assertEquals(7, result.size());
		assertEquals('a', result.get(0));
		assertEquals('c', result.get(2));
		assertEquals('z', result.get(6));
	}

}
