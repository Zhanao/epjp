package s066ex;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Car();
        vehicles[1] = new Bus();
        vehicles[2] = new MotorBike();
        
        boolean rightDirection = true;
        int angle = 50;
//        for(Vehicle vehicle : vehicles) {
//        	//(2) bike:call the specific method
//            vehicle.steer(rightDirection);
//            rightDirection = !rightDirection;
//        }
        
//        for(Vehicle vehicle : vehicle) {
//        	if (vehicle instanceof Motorbike) {
//            MotorBike bike = (Motorbike)vehicle;
//        	}
//        	else {
//        		vehicles[i].steer(rightDirection);        		
//        	}
//        	rightDirection = !rightDirection;
//        }
        
        
        for(int i = 0; i < 3; i++) {
        	if (i == 2) {
            MotorBike.steer(rightDirection, angle);
        	}
        	else {
        		vehicles[i].steer(rightDirection);        		
        	}
        	rightDirection = !rightDirection;
        }
        
        Conditioning[] conditionings = new Conditioning[2];
        conditionings[0] = new Bus();
        conditionings[1] = new Car();
        
        int temperature = 20;
        for(Conditioning conditioning : conditionings) {
            conditioning.setTemperature(temperature);
            temperature += 1;
        }
        
        //(1) steer the car in conditionings
        for(Conditioning conditioning : conditionings) {
        if (conditioning instanceof Car) {
        	System.out.println("This is a car ->");
        	Car car = (Car)conditioning;
        	car.steer(true);
        } else {
           	System.out.println("This is not a car.");
        	}
        }
    }
}
