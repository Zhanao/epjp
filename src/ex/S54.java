package ex;

public class S54 {
    /**
     * Check if the parameter is positive, negative, or zero
     *  
     * @param value an integer
     * @return "positive", "negative", or "zero"
     */
    public static String checkSign(int value) {
    	if (value > 0) {
    		return "positive";
    	} 
    	
    	if (value < 0) {
    		return "negative";
    	}
    	
    	else return "zero";
        
    }
    
    /**
     * Check if the parameter is odd
     * 
     * @param value an integer
     * @return "odd" or "even"
     */
    public static boolean isOdd(int value) {
        if (value % 2 == 1) {
        	return true;
        }
        return false;
    }
    
    /**
     * Convert the parameter to its English name, if it is in [0..9]
     * 
     * @param value an integer
     * @return "zero" for 0 ... "nine" for 9, or "other"
     */
    public static String asWord(int value) {
        if (value > 9) {return "other";}
        if (value == 1) {return "one";}
        if (value == 2) {return "two";}
        if (value == 3) {return "three";}
        if (value == 4) {return "four";}
        if (value == 5) {return "five";}
        if (value == 6) {return "six";}
        if (value == 7) {return "seven";}
        if (value == 8) {return "eight";}
        if (value == 9) {return "nine";}
        return "zero";
    }
    
    /**
     * Convert a value in the interval [0, 100] to a letter in [A, F]
     * 
     * A if value > 90
     * B if value in (80, 90]
     * ...
     * F if value <= 50
     * 
     * @param percentile in [0, 100]
     * @return a letter in [A, F]
     */
    public static char vote(double percentile) {
        if (percentile > 90) {return 'A';}
        if (percentile > 80 && percentile <= 90) {return 'B';}
        if (percentile > 70 && percentile <= 80) {return 'C';}
        if (percentile > 60 && percentile <= 70) {return 'D';}
        if (percentile > 50 && percentile <= 60) {return 'E';}
        return 'F';
    }
    
    /**
     * Leap year checker
     * 
     * @param year
     * @return true if leap year
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
        	if (((int) year/100) % 4 == 0) {
        		return true;
        	}
        	return false;
        }
        return false;
    }
    
    /**
     * Sort the input parameters
     * 
     * @param a
     * @param b
     * @param c
     * @return a sorted array
     */
    public static int[] sort(int a, int b, int c) {
        int[] result = new int[3];
//        result[0] = Math.min(a, Math.min(b, c));
//        result[2] = Math.max(a, Math.max(b, c));
        
        if (a <= b && a <= c) {
        	result[0] = a;
        	if (b <= c) {result[1] = b;
        	result[2] = c;}
        	else {
        		{result[1] = c;
            	result[2] = b;}
        	}
        	}
        
        if (b <= a && a <= c) {
        	result[0] = b;
        	if (a <= c) {result[1] = a;
        	result[2] = c;}
        	else {
        		{result[1] = c;
            	result[2] = a;}
        	}
        	}
        
        if (c <= a && c <= b) {
        	result[0] = c;
        	if (a <= b) {result[1] = a;
        	result[2] = b;}
        	else {
        		{result[1] = b;
            	result[2] = a;}
        	}
        	}
        
        
//        if (result[0] <= a && result[2] >= a) {
//        	result[1] = a;
//        }
//        if (result[0] <= b && result[2] >= b) {
//        	result[1] = b;
//        }
//        else {result[1] = c;}
        
        
        return result;
    }
}
