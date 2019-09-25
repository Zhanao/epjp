package s096;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;


import org.junit.jupiter.api.Test;

class SingleCharTest {

	@Test
	void singlechar() {
		 String al = new String("abaccsafdafadfzzc");
		 SingleChar c=new SingleChar();
		 TreeSet<Character>  result=c.getSinglechar(al);
		assertEquals(7, result.size());
		System.out.println(result);
//		assertThat(result.get(0),is('a'));
//		assertThat(result.get(2),is('c'));
		
		
	}

}
