package s069;

public class Main {
    public static void main(String[] args) {
    	//Mammal m = new Mammal(); non posso fare un nuovo oggetto Mammal perche l'ho fatto astratto
        Mammal[] mammals = new Mammal[2]; // qui posso perche sto creando new oggetti delle sottoclassi.
        mammals[0] = new Dog(63, 40);
        mammals[1] = new Cat(63, 20);

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }
    }
}
