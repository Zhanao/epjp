package ex;

public class S53 {

	
    /**
     * Average speed
     * 
     * @param distance in meters
     * @param time     in seconds
     * @return speed in meters per second
     */
    public static double speed(double distance, double time) {
    	double s = 0;
        s = distance/time;
        return s;
    }

    /**
     * Distance between (x0, y0) and (x1, y1)
     * 
     * @param x0 first point x
     * @param y0 first point y
     * @param x1 second point x
     * @param y1 second point y
     * @return distance
     */
    public static double distance(int x0, int y0, int x1, int y1) {

        double d = Math.sqrt((double) ( Math.pow(x0-x1, 2) + Math.pow(y0-y1, 2)));
        return d;
    }


	/**
     * Engine capacity
     * 
     * @param bore in mm
     * @param stroke in mm
     * @param nr     number of cylinders
     * @return the engine capacity in cm^3
     */
    public static double engineCapacity(double bore, double stroke, int nr) {

        double engine = (Math.PI*Math.pow(bore/2, 2)*stroke*((double) nr))/1000;
        return engine;
    }

    // somma delle cifre in un numero
    /**
     * Add up all the digits in an integer
     * 
     * @param value
     * @return sum of digits
     */
    public static int digitSum(int value) {
    	value = Math.abs(value);
    	int digitsummation = 0;
    	
    	if (value > 999) {
    		digitsummation =-1;
    		return digitsummation;
    	}
    	
    	else {
    	int unit = value % 10;
        int decim = ((value - unit)/10) % 10;
        int cent = (value - unit - decim*10)/100;
        digitsummation = decim + unit + cent;
    	return digitsummation; 
    	}
    }
    
//    public static int digitSumTrue(int value) {
//    	value = Math.abs(value);
//    	int j = 0;
//    	int digitsummation = 0;
//		int[] array = new int[1];
//    	
//    	for (int i=1; value == 0; i++) {
//    		vectorMod = vectorMod[i];
//    		int unitMod = value % 10;
//    		vectorMod[i] = unitMod
//    		digitsummation = digitsummation + unitMod;
//    	}
//    	return digitsummation;
//    }
    
}
