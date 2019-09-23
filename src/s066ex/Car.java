package s066ex;

public class Car extends Vehicle implements Conditioning {
    public void setTemperature(int newTemp) {
        System.out.println("Car temperature now is " + newTemp );
    }
}
