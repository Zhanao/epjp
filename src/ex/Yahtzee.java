package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Yahtzee {

	public static int getYahtzeePoint(int[] diceCombination, YzeeCombinations combination) {
		int pointCOMBINATION = 0;

		if (combination == YzeeCombinations.ONE) {
			for (int i = 0; i < diceCombination.length; i++) {
				if (diceCombination[i] == 1) {
					pointCOMBINATION++;
				}
			}
		}

		if (combination == YzeeCombinations.TWO) {
			for (int i = 0; i < diceCombination.length; i++) {
				if (diceCombination[i] == 1) {
					pointCOMBINATION += 2;
				}
			}
		}

		if (combination == YzeeCombinations.THREE) {
			for (int i = 0; i < diceCombination.length; i++) {
				if (diceCombination[i] == 1) {
					pointCOMBINATION += 3;
				}
			}
		}

		if (combination == YzeeCombinations.FOUR) {
			for (int i = 0; i < diceCombination.length; i++) {
				if (diceCombination[i] == 1) {
					pointCOMBINATION += 4;
				}
			}
		}

		if (combination == YzeeCombinations.FIVE) {
			for (int i = 0; i < diceCombination.length; i++) {
				if (diceCombination[i] == 1) {
					pointCOMBINATION += 5;
				}
			}
		}

		if (combination == YzeeCombinations.SIX) {
			for (int i = 0; i < diceCombination.length; i++) {
				if (diceCombination[i] == 1) {
					pointCOMBINATION += 6;
				}
			}
		}

		if (combination == YzeeCombinations.LITTLE) {
			List<Integer> diceList = new ArrayList<>();
			for (int i = 0; i < diceCombination.length; i++) {
				diceList.add(diceCombination[i]);
			}
			TreeSet<Integer> diceTree = new TreeSet<>(diceList);
			if (diceTree.size() == 4) {
				if ((diceTree.last() - diceTree.first()) == 3) {
					pointCOMBINATION = 30;
				}

			}
			if (diceTree.size() == 5) {
				if ((diceTree.last() - diceTree.first()) == 4) {
					pointCOMBINATION = 30;
				}
				if ((diceTree.last() - diceTree.first()) == 5 && diceTree.last() == 6) {
					pointCOMBINATION = 30;
				}
				if ((diceTree.last() - diceTree.first()) == 5 && diceTree.first() == 1) {
					pointCOMBINATION = 30;
				}
			}

		}

		if (combination == YzeeCombinations.BIG) {
			List<Integer> diceList = new ArrayList<>();
			for (int i = 0; i < diceCombination.length; i++) {
				diceList.add(diceCombination[i]);
			}
			TreeSet<Integer> diceTree = new TreeSet<>(diceList);
			if (diceTree.size() == 5 && (diceTree.last() - diceTree.first()) == 4) {
				pointCOMBINATION = 40;
			}
		}
		
		if (combination == YzeeCombinations.TRIS) {

		}

		if (combination == YzeeCombinations.FOUREQUALS) {

		}

		if (combination == YzeeCombinations.FULL) {

		}

		if (combination == YzeeCombinations.YAHTZEE) {

		}

		if (combination == YzeeCombinations.CHANCE) {

		}

		return pointCOMBINATION;
	}

}
