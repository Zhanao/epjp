package s105;

public class Stat {
	private char mode;
	private int frequency;
	private int elementsNumber;

	public Stat(char mode, int frequency, int elementsNumber) {
		this.mode = mode;
		this.frequency = frequency;
		this.elementsNumber = elementsNumber;
	}
	
	
	public char toMode() {
		return mode;
	}
	
	public int toFrequency() {
		return frequency;
	}
	
	public int toElementsNumber() {
		return elementsNumber;
	}
	
	public String toString() {
		return "The mode is " + mode + ", the frequency of the mode is " + frequency + " and the number of the elements is " + elementsNumber + ".";
	}
}
