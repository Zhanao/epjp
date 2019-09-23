package s071;

public class Poodle extends Dog {
	private static final int DEFAULT_DENSITY = 3;
	private int curlDensity;
	
	public Poodle() {
		super(); // chiama il costruttore default di chi sta sopra ovvero Dog, quando uso super deve essere il primo statement del costruttore
		this.curlDensity = DEFAULT_DENSITY;
	}

	public Poodle(String name) {
		super(name); // qua non ho dato il valore di curlDensity, quindi per default sarà 0
	}

	public Poodle(String name, int weight) {
		this(name, weight, DEFAULT_DENSITY);
	}

	public Poodle(String name, int weight, int curlDensity) {
		super(name, weight);
		this.curlDensity = curlDensity;
	}
	
	@Override
	public String getName() {
		return "Poodle " + super.getName(); //se avessi scritto semplicemente getName o this.getName, mi si crea un loop infinito che si richiama se stesso.
	}
											//string s =poodle.getName(); loop infinito
	@Override
	public String toString() {
		return "Poodle " + super.toString() + " " + curlDensity;
	}
}
