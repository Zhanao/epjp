package s105;

public class Node {
	private int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
	}
	
	public int getValue() {                                            
		return value;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void getValue(int value) {
		this.value = value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "{" + this.value + "}";
	}
 
}
