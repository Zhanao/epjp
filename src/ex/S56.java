package ex;

public class S56 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
        String reverse = " ";
        reverse = reverse.replace(' ', s.charAt(s.length()-1));
        for (int i = 1; i < s.length(); i++) {
        	String appoggio = " ";
        	appoggio = appoggio.replace(' ', s.charAt(s.length()-i-1));        	
        	reverse = reverse.concat(appoggio);
        }
        return reverse;
    }

    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindromeFirstVersion(String s) {
    	char[] arrayChar = new char[s.length()];
    	for (int i = 0; i < s.length(); i++) {
    		arrayChar[i] = s.charAt(i);
    	}
    	int j = 0;
    	while (arrayChar[j] != s.charAt(s.length() - j - 1)) {
    		j++;
    		return false;
    	}
       	return true;
    }
    
    public static boolean isPalindrome(String s) {	
    	int j = 0;
    	while (s.charAt(j) == s.charAt(s.length() - j - 1) && j < s.length() - 1) {
    		j++;
    		continue;
    	}
    	j = j + 1;
    	if (j == s.length()) {
    		return true; 
    	}
    	else {
    		return false;
    	}
    }

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    
    public static String removeVowels(String s) {
    	String result = s.replaceAll("[AaEeIiOoUuYy]", "");
    	return result;
    }
    
    public static String removeVowels2(String s) {
    	String result = "";
//        String[] arrayString = new String[s.length()];
//        for (int i = 0; i < s.length(); i++) {
//        	arrayString[i] = s.substring(i, i+1);
//        }
    	String[] arrayString = s.split("");
        
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) != 'e' && s.charAt(i) != 'a' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' && s.charAt(i) != 'y') {
        		result = result.concat(arrayString[i]);
        	}
        	else continue;
        }
        
        return result;
    }


    /**
     * Convert from binary to decimal
     * 
     * @param s a string that contains the binary representation of an integer
     * @return the converted integer
     */
    public static int bin2dec(String s) {
    	int result = 0;
    	int[] numArrayDec = new int[s.length()];
    	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == '0') { numArrayDec[i] = 0; }
    		if (s.charAt(i) == '1') { numArrayDec[i] = 1; }
    	}

    	for (int i = 0; i < s.length(); i++) {
    		result = result + ((int) Math.pow(2, s.length() - i -1)) * numArrayDec[i];
    	}

        return result;
    }
    
    public static int bin2decSecondVersion(String s) {
    	int result = 0;	
    	for (int i = 0; i < s.length(); i++) {
    		if (s.charAt(i) == '1') { 
        		result += ((int) Math.pow(2, s.length() - i -1)); 
        		}
    	}

        return result;
    }
    
    
    public static int bin2decWord(String s) {
    	int result = 0;
    	
    	for (int j = 0; j < s.length(); j++) {
    	
    		if (s.charAt(j) != '0' && s.charAt(j) != '1') {
    			result = -1;
    		}
    	
    		else {
    			int[] numArrayDec = new int[s.length()];
    	
    		for (int i = 0; i < s.length(); i++) {
    			if (s.charAt(i) == '0') { numArrayDec[i] = 0; }
    			if (s.charAt(i) == '1') { numArrayDec[i] = 1; }
    		}

    		for (int i = 0; i < s.length(); i++) {
    			result = result + ((int) Math.pow(2, s.length() - i -1)) * numArrayDec[i];
    		}
    		}
    	}

        return result;
    }
    
    public static int bin2decDebunk(String s) {
    	int result = 0;
    	if (s.charAt(0) == '-') { 
    		s = s.substring(1);
    		int[] numArrayDec = new int[s.length()];
        	
        	for (int i = 0; i < s.length(); i++) {
        		if (s.charAt(i) == '0') { numArrayDec[i] = 0; }
        		if (s.charAt(i) == '1') { numArrayDec[i] = 1; }
        	}

        	for (int i = 0; i < s.length(); i++) {
        		result = result + ((int) Math.pow(2, s.length() - i -1)) * numArrayDec[i];
        	}
        	result = - result;
    	}
    	
    	else {
    		int[] numArrayDec = new int[s.length()];
        	
        	for (int i = 0; i < s.length(); i++) {
        		if (s.charAt(i) == '0') { numArrayDec[i] = 0; }
        		if (s.charAt(i) == '1') { numArrayDec[i] = 1; }
        	}

        	for (int i = 0; i < s.length(); i++) {
        		result = result + ((int) Math.pow(2, s.length() - i -1)) * numArrayDec[i];
        	}
    	}

        return result;
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++) {
        	result[i] = data[data.length - i - 1];
        }

        return result;
    }

    /**
     * Calculate the average
     * 
     * @param data
     * @return the average
     */
    public static double average(int[] data) {
        long summation = 0;
        for (int i = 0; i < data.length; i++) {
        	summation = summation + data[i];
        }
        long average = summation/data.length;
        return average;
    }
    
    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
    	int max = Math.max(data[0], data[1]);
        for (int i =2; i < data.length; i++) {
        	max = Math.max(max, data[i]);
        }
        return max;
    }
    
    public static int parseInt(String s) {
    	int result = 0;
    	int appoggio = 0;

        for (int i = 0; i < s.length(); i++) {
        	if ( s.charAt(i) >= '0' && s.charAt(i) <= '9' || s.charAt(i) == '-') {
        		continue;
        	}
        	else {
        		return result;
        	}
        }
        
        if (s.charAt(0) == '-') {
        	s = s.substring(1);
        	appoggio = 1;
        }
        
        for (int i = 0; i < s.length(); i++) {
        	if (s.charAt(i) == '9') { result += 9*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '8') { result += 8*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '7') { result += 7*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '6') { result += 6*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '5') { result += 5*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '4') { result += 4*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '3') { result += 3*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '2') { result += 2*Math.pow(10, s.length() - i -1); }
        	if (s.charAt(i) == '1') { result += 1*Math.pow(10, s.length() - i -1); }
        	else { continue; }
        }
        
        if (appoggio == 1) {
        	result = - result;
        }
                
        return result;
    }
    
    public static int parseIntOpt(String s) {
    	int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
        	if (s.charAt(i) == '9') { result += 9*Math.pow(10, i); }
        	if (s.charAt(i) == '8') { result += 8*Math.pow(10, i); }
        	if (s.charAt(i) == '7') { result += 7*Math.pow(10, i); }
        	if (s.charAt(i) == '6') { result += 6*Math.pow(10, i); }
        	if (s.charAt(i) == '5') { result += 5*Math.pow(10, i); }
        	if (s.charAt(i) == '4') { result += 4*Math.pow(10, i); }
        	if (s.charAt(i) == '3') { result += 3*Math.pow(10, i); }
        	if (s.charAt(i) == '2') { result += 2*Math.pow(10, i); }
        	if (s.charAt(i) == '1') { result += 1*Math.pow(10, i); }
        	if (s.charAt(i) == '-') { result *= -1; }
         	else { continue; }
        }
                
        return result;
    }
    
    public static int frequency(int number) {
		int moda = 0;
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
			if (appoggio == 9) { numberArrayFreq[9] += 1; }
		}
		
		for (int i = 0; i < 10; i++) {
			appoggio = Math.max(numberArrayFreq[i], moda);
			
			if (appoggio > moda) {
				moda = i;
			}
			else continue;
		}
		
		return moda;
	}
}
