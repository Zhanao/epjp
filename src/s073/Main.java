package s073;

public class Main {
	public static void main(String[] args) {
//		Cat cat = (Cat) new Dog();

		Pet pet = new Dog("Bob"); // reference come pet, oggetto come dog
									// se ho Pet pet = new Pet("Bob"), non posso castare sul pet
		// risky

		Dog dog = (Dog) pet;
		dog.bark();

		// next line leads to a ClassCastException
		// Cat cat = (Cat) pet;
		// System.out.println(System.identityHashCode(cat));
		System.out.println(System.identityHashCode(dog));

		if (pet instanceof Cat) {
			Cat tom = (Cat) pet;
			tom.meow();
		} else {
			System.out.println("This pet is not a cat!");
		}
	}
}
