package ex;

public class S56 {
    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */
    public static String reverse(String s) {
       StringBuilder rev= new StringBuilder(s.length());
       for (int i = 0 ; i< s.length(); i++) {
    	   rev.insert(rev.length()-i, s.charAt(i));
       }
        return rev.toString();
    }

    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */
    public static boolean isPalindrome(String s) {
    	boolean test = true;
    	for(int j = 0; j < s.length()/2+1; j++) {
        	if(s.charAt(j)!=s.charAt(s.length()-1-j)) {
        	
        		test= false;
        		break;
        	}
        }
       return test; 
    }

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */
    public static String removeVowels(String s) {
    	StringBuilder copy = new StringBuilder();
    	for(int i=0;i<s.length() ;i++) {
    		if (s.charAt(i)=='a'||
    			s.charAt(i)=='e'||
    			s.charAt(i)=='i'||
    			s.charAt(i)=='o'||
    			s.charAt(i)=='u'||
    			s.charAt(i)=='A'||
    			s.charAt(i)=='E'||
    			s.charAt(i)=='I'||
    			s.charAt(i)=='O'||
    			s.charAt(i)=='U'){
    				continue;	
    			}else {

    			copy.append(s.charAt(i));	
    			}
    	}
        return copy.toString();
    }

    /**
     * Convert from binary to decimal
     * 
     * @param s a string that contains the binary representation of an integer
     * @return the converted integer
     */
    public static int bin2dec(String s) {
    	int dec=0;
    	for(int i=0;i<s.length();i++) {
    		if (s.charAt(s.length()-i-1) == '1') {
    			dec=(int)(dec+ Math.pow(2, i));
    		}
    	}
    		
        return dec;
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */
    public static int[] reverse(int[] data) {
        int[] result = new int[data.length];
        for (int i=0; i<data.length;i++) {
        result[data.length-1-i]=data[i] ;	
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
       double sum=0;
    	
    	for(int i=0; i<data.length;i++) {
    	   sum=sum+data[i];
       }
    	double media = sum/data.length;
    	
        return media;
    }
    
    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */
    public static int max(int[] data) {
    	int m= Integer.MIN_VALUE; // perche l'utente puo' inserire valori negativi
    	for(int i=0 ; i < data.length ;i++) {
    		m=Math.max(m,data[i]);
    	}		
        return m;
    }
}
