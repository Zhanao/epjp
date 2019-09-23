package s069;

public class Main {
    public static void main(String[] args) {
    	
        Mammal[] mammals = new Mammal[2];     
        mammals[0] = new Dog(63, 40);
        mammals[1] = new Cat(63, 20);
        
        System.out.println(mammals[0]);

        for (Mammal mammal : mammals) {
            System.out.println(mammal.toString());
        }
        
        //Mammal m = new Mammal(12); on si può fare perchè la classe mamma è astratta
    }
}
