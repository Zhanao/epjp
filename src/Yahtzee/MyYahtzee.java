package Yahtzee;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class MyYahtzee {

	public int myYahtzee(int[] dice, Combinazione c) {

		MyYahtzee yz = new MyYahtzee();

		switch (c) {
		case UNO:
			return yz.getOnes(dice);

		case DUE:
			return yz.getTwos(dice);
			
		case TRE:
			return yz.getThrees(dice);
			
		case QUATTRO:
			return yz.getFours(dice);

		case CINQUE:
			return yz.getFives(dice);

		case SEI:
			return yz.getSixs(dice);

		case PICCOLASCALA:
			return yz.getLittleSt(dice);
			
		case GRANDESCALA:
			return yz.getGreatSt(dice);
			
		case TRIS:
			return yz.getTris(dice);
			
		case DADIUGUALI4:
			return yz.getSamedice4(dice);
			
		case FULL:
			return yz.getFull(dice);
			
		case YAHTZEE:
			return yz.getYahtzee(dice);
			
		case CHANCE:
			return yz.getChance(dice);

		}
		return 0;
	}

	private int getOnes(int[] dice) {
		int score = 0;
		for (int die : dice) {
			if (die == 1) {
				score += 1;
			}
		}
		return score;
	}

	private int getTwos(int[] dice) {
		int score = 0;
		for (int die : dice) {
			if (die == 2) {
				score += 2;
			}

		}
		return score;
	}

	private int getThrees(int[] dice) {
		int score = 0;
		for (int die : dice) {
			if (die == 3) {
				score += 3;
			}

		}
		return score;
	}

	private int getFours(int[] dice) {
		int score = 0;
		for (int die : dice) {
			if (die == 4) {
				score += 4;
			}

		}
		return score;
	}

	private int getFives(int[] dice) {
		int score = 0;
		for (int die : dice) {
			if (die == 5) {
				score += 5;
			}

		}
		return score;
	}

	private int getSixs(int[] dice) {
		int score = 0;
		for (int die : dice) {
			if (die == 6) {
				score += 6;
			}

		}
		return score;
	}

	private int getLittleSt(int[] dice) {
		Arrays.sort(dice);

		for (int i = 0; i < 2; i++) {
			if (dice[i] == dice[i + 1] - 1 && dice[i + 1] == dice[i + 2] - 1 && dice[i + 2] == dice[i + 3] - 1) {
				return 30;
			}
		}
		return 0;
	}

	private int getGreatSt(int[] dice) {
		Arrays.sort(dice);

		if ((dice[0] == dice[1] - 1) && (dice[1] == dice[2] - 1) && (dice[2] == dice[3] - 1)
				&& (dice[3] == dice[4] - 1)) {
			return 40;
		}
		return 0;

	}

	private int getTris(int[] dice) {
		Arrays.sort(dice);

		int count = 0;
		for (int i = 0; i < dice.length - 1; i++) {
			if (dice[i] == dice[i + 1]) {
				count++;
			}
			if (count == 3) {
				return IntStream.of(dice).sum();
			}
		}
		return 0;
	}

	private int getSamedice4(int[] dice) {

		Arrays.sort(dice);

		int count = 1;
		for (int i = 0; i < dice.length - 1; i++) {
			if (dice[i] == dice[i + 1]) {
				count++;
			}
			if (count == 4) {
				return IntStream.of(dice).sum();
			}
		}
		return 0;
	}

	private int getFull(int[] dice) {
		Arrays.sort(dice);
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for (int i : dice) {
			tr.add(i);
		}
		if (tr.size() == 2) {
			return 25;
		}
		return 0;
	}

	private int getYahtzee(int[] dice) {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for (int i : dice) {
			tr.add(i);
		}
		if (tr.size() == 1) {
			return 50;
		}
		return 0;
	}

	private int getChance(int[] dice) {
		return IntStream.of(dice).sum();
	}
}
