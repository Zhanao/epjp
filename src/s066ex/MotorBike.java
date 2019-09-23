package s066ex;

public class MotorBike extends Vehicle {
    public static void steer(boolean right, int angle) { //vogliamo aggiungere l'angolo al quale la moto piega
        System.out.println("Steering " + (right ? "right" : "left") + " and leans at " + angle);
    }
}
