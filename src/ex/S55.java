package ex;

public class S55 {
    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last the right limit
     * @return the sum of all the numbers, or zero
     */
    public static long sum(int first, int last) {
       if (last<first) {
    	   return 0;
       }else {
    	   int sum=0;
    	   for (int i = first; i<last+1;i++) {
    		   sum=sum+i;
    	   }
    	   return sum;
       }
    }

    /**
     * Add up only the even numbers in the passed closed interval
     * 
     * @param first the left limit
     * @param last the right limit
     * @return the sum of all the even numbers, or zero
     */
    public static long evenSum(int first, int last) {
    	if (last<first) {
     	   return 0;
        }else {
     	   int sum=0;
     	   if (first%2==0) {
     			  for (int i = first; i<last+1;i=i+2) {
     	     		   sum=sum+i;
     	     	   }  
     	   }else {
     		  for (int i = first+1; i<last+1;i=i+2) {
	     		   sum=sum+i;
	     	   }  
     	   }
     	   
     	   return sum;
        }

    }
    
    /**
     * Factorial
     * 
     * @param value
     * @return factorial of input value, or zero
     */
    public static long factorial(int value) {
        if (value<0) {
        	return 0;
        }
    	if (value==0) {
        	return 1;
        }
    	int fat=1;
    	for(int i=1; i< value +1;i++) {
    		fat=fat*i;
    	}
        	
        	
        return fat;
    }
    
    /**
     * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
     * 
     * @param value
     * @return the Fibonacci number of value, or zero
     */
    public static long fibonacci(int value) {
    	if (value <0) {
    		return -1;
    	}
    	int a=0;
    	int b=1;
    	int fib=0;
    	if (value==0) {
    		return a;
    	}
    	if (value == 1) {
    		return b;
    	}
    	
    	for (int i=1;i<value;i++) {
    		fib=a+b; //1 - 2 - 3 - 5
    		a=b; //1 - 1 - 2 - 3
    		b=fib; //1 - 2 - 3 - 5
    	}
        return fib;
    }
    
    /**
     * Multiplication table
     * 
     * @param value
     * @return The multiplication table for value, when possible
     */
    public static int[][] multiplicationTable(int value) {
        int[][] result = new int[value][value];
        for(int i =1 ; i< value +1; i++) {
        	for(int j=1; j< value + 1;j++) {
        		result[i-1][j-1]=i*j ;
        		
        }
        		
        	}
   
        
        
        return result;
    }
}
