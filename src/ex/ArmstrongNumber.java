package ex;

public class ArmstrongNumber {
	
	public static boolean armstrongCalculator(int value) {
    	if (value < 0) {
    		throw new IllegalArgumentException("The number " + value + " is negative, hence cannot be an Armstrong number.");
    	}
    	
    	int index = 0;
    	int valueCopy = value;
    	
    	while (valueCopy != 0) {
    		valueCopy = valueCopy/10;
    		index++;
    	}
    	
    	double digitSummationPowered = 0;
    	valueCopy = value;
    	
    	while (valueCopy != 0) {
    		int last = valueCopy % 10;
    		digitSummationPowered += Math.pow(last, index);
    		valueCopy = valueCopy/10;
    	}
    	
    	if (value == (int) digitSummationPowered) {
    		return true;
    		//return "The number " + value + "is an Armstrong number.";
    	} else {
    		return false;
    		//return "The number " + value + "is not an Armstrong number.";
    	}
    }

}
