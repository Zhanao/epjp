package s069;

public class Cat extends Mammal {
    private Tail tail;

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays); // syper.gestation = gestationsDay; oppure this.gestation = gestationDay; (poco chiaro perche gestation lo prendo da mammal). sto chiamando il costruttore nella classe madre
        this.tail = new Tail(tailLen); // this. : tail non è altro che una variabile di istanza dell'oggetto corrente.
    }

    @Override
    public String toString() {
        return "Cat [tail=" + tail + ", gestation=" + gestation + "]";
    } // gestation è la variabile di istanza protetta proveniete da mammal
}
