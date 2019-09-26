package s111;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class getStatTest {

	@Test
	void testStat() {
		String s="abcbab";
		getStat gs=new getStat();
		System.out.println(gs.getStat(s));
		
		
		
	}

}
