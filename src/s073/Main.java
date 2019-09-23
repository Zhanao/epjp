package s073;

public class Main {
    public static void main(String[] args) {
//		Cat cat = (Cat) new Dog(); questo non si può fare, si può andare su e in giù, ma non si può fare un cast

        Pet pet = new Dog("Bob");

        // risky perchè si potrebbero perdere informazioni, un po' come quando castiamo un long ad un int, potrebbero perdere informazioni
        Dog dog = (Dog) pet;
        dog.bark();

//        // next line leads to a ClassCastException
//        Cat cat = (Cat) pet; //stiamo castando un pet come un gatto e questo è un disastro
//        System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) { //qua chiediamo se effettivamente pet è un gatto e non un cane
            Cat tom = (Cat) pet;
            tom.meow();
        }
        else {
        	System.out.println("This is not a pet.");
        }
    }
}
