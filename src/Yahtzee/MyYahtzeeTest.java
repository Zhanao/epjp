package Yahtzee;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyYahtzeeTest {

	@Test
	void unotest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(2, my.myYahtzee(dice, Combinazione.UNO));
	}

	@Test
	void duetest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(2, my.myYahtzee(dice, Combinazione.DUE));
	}

	@Test
	void tretest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(3, my.myYahtzee(dice, Combinazione.TRE));
	}
	

	@Test
	void quattrotest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(4, my.myYahtzee(dice, Combinazione.QUATTRO));
	
	}

	@Test
	void cinquetest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.CINQUE));
	
	}

	@Test
	void seitest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.SEI));
	
	}

	@Test
	void piccolascalatest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 4 };
		assertEquals(30, my.myYahtzee(dice, Combinazione.PICCOLASCALA));
	
	}
	
	@Test
	void piccolascalatest0() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 5 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.PICCOLASCALA));
	
	}

	@Test
	void grandescalatest0() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 1, 5 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.GRANDESCALA));
	
	}
	@Test
	void grandescalatest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 3, 4, 5 };
		assertEquals(40, my.myYahtzee(dice, Combinazione.GRANDESCALA));
	
	}
	
	@Test
	void tristest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 6, 6, 6, 6, 6 };
		assertEquals(30, my.myYahtzee(dice, Combinazione.TRIS));
	}
	@Test
	void tristest0() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 1, 2, 2, 1, 5 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.TRIS));
	}
	

	@Test
	void dadiuguale4test() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 5, 3, 3, 3, 3 };
		assertEquals(17, my.myYahtzee(dice, Combinazione.DADIUGUALI4));
	}
	
	@Test
	void dadiuguale4test0() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 5, 3, 4, 3, 3 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.DADIUGUALI4));
	}

	@Test
	void fulltest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 4, 4, 4, 1, 1 };
		assertEquals(25, my.myYahtzee(dice, Combinazione.FULL));
	}
	

	@Test
	void fulltest0() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 4, 4, 5, 1, 1 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.FULL));
	}

	@Test
	void yahtzee() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 6, 6, 6, 6, 6 };
		assertEquals(50, my.myYahtzee(dice, Combinazione.YAHTZEE));
	}
	
	@Test
	void yahtzee0() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 6, 6, 6, 1, 6 };
		assertEquals(0, my.myYahtzee(dice, Combinazione.YAHTZEE));
	}

	@Test
	void chancetest() {
		MyYahtzee my = new MyYahtzee();
		int[] dice = { 3, 6, 3, 2, 5 };
		assertEquals(19, my.myYahtzee(dice, Combinazione.CHANCE));
	}

}
