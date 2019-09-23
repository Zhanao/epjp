package s069;

public abstract class Mammal {
    protected int gestation;

    public Mammal(int gestation) {
        this.gestation = gestation;
    }

    @Override
    public String toString() {
        return "Mammal [gestation=" + gestation + "]";
    }
}

class x { // sembra vuota ma ha tutto quello che è presente in Object, che è la classe madre di tutti e tra i metodi ha anche toString
		// scritto in modo esplicito class x extends Object
}