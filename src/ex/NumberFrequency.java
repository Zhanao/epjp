package ex;

public class NumberFrequency {

	public static int frequency(int number) {
		int max = 0;
		int appoggio = 0;

		int[] numberArrayFreq = new int[10];
				
		while (number > 0) {
			appoggio = number % 10;
			number = (number - appoggio)/10;
			if (appoggio == 0) { numberArrayFreq[0] += 1; }
			if (appoggio == 1) { numberArrayFreq[1] += 1; }	
			if (appoggio == 2) { numberArrayFreq[2] += 1; }
			if (appoggio == 3) { numberArrayFreq[3] += 1; }
			if (appoggio == 4) { numberArrayFreq[4] += 1; }
			if (appoggio == 5) { numberArrayFreq[5] += 1; }
			if (appoggio == 6) { numberArrayFreq[6] += 1; }
			if (appoggio == 7) { numberArrayFreq[7] += 1; }
			if (appoggio == 8) { numberArrayFreq[8] += 1; }
			else { numberArrayFreq[9] += 1; }
		}
		
		for (int i = 0; i < 9; i++) {
			appoggio = Math.max(numberArrayFreq[i], numberArrayFreq[i+1]);
			
			if (appoggio > max) {
				max = i;
			}
			else {
				max = i + 1;
			}
		}
		
		return max;
	}
}
