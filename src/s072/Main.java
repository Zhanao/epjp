package s072;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom", 2.42); //come costruiamo un oggetto

        String name = tom.getName();
        double speed = tom.getSpeed();

        System.out.println("Name and speed: " + name + ", " + speed);
    }
}
