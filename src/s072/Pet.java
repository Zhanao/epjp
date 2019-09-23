package s072;

public class Pet {
    private String name; //name è un dato di istanza privato

    public Pet(String name) { //è un costruttore come parametro name
        this.name = name; // qui dobbiamo usare il this per passare il dato alla variabile d'istanza, se mettessimo name = name il cane si chiamerebbe name
    }

    public String getName() {
        return name;
    }
}