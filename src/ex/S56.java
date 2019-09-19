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
    	while (s.charAt(j) != s.charAt(s.length() - j - 1)) {
    		j++;
    		return false;
    	}
       	return true;
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
        String[] arrayString = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
        	arrayString[i] = s.substring(i, i+1);
        }
        
        for (int i = 0; i < s.length(); i++) {
        	if (arrayString[i] != "e") {
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
        // TODO
        return 0;
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
        	result[i] = data[data.length - i -1];
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
        int summation = 0;
        for (int i = 0; i < data.length; i++) {
        	summation = summation + data[i];
        }
        int average = summation/data.length;
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
}
