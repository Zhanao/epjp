package s072;

public class Dog extends Pet {
    private double speed;

    public Dog(String name) { //costruttore con parametro name
        this(name, 0);
    }

    public Dog(String name, double speed) {
        super(name); //costruttore che chiama il costruttore della classe madre
        this.speed = speed; //assegnazione alla variabile d'istanza al parametro dato
    }

    public double getSpeed() { //costruttore per avere la velocità che era privata, se non ci fosse stata non sarrebe stata resra disponibile
        return speed; //alla stessa maniera avremmo potuto mettere this.speed
    }
}