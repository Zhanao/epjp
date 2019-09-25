package s106;

public class Nodo {
	private int valore;
	private Nodo next;
	
	Nodo(int valore){
		this.valore=valore;
		this.next=null;
	}
	
	public int getValue() {
		
		
		return valore;
		
	}
	
	public Nodo getNext() {
		return next;
	}
	
	public void setNext(Nodo n) {
		this.next=n;
	}
	
	public String toString() {
		return " " + this.valore +" ";
	}

}
