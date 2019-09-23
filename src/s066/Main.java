package s066;

public class Main {
    public static void main(String[] args) {
        Barker[] barkers = new Barker[2];
        
        barkers[0] = new Fox();
        barkers[1] = new Dog();

        for(Barker barker: barkers) {
            System.out.println(barker.bark());
        }
        
        BarkAndWag baw = new Dog();
        System.out.println(baw.tailWaggingSpeed()); // dato che chiamo un metodo di barkandwag posso definire un oggetto di tipo BarkAndWag

        Dog dog = new Dog();
        System.out.println(dog.bark(3)); // è il metodo bark(int) non entra con BarkAndWag quindi per forza devo creare un oggetto Dog.
    }
}
