package s106;

public class MyList {

	Nodo head;

	public void add(int i) {

		Nodo puntatore = head;
		Nodo puntPrima = head;
		Nodo n = new Nodo(i);
		if(puntatore == null) {
			head=n;
			return;
		}
		
		while (puntatore != null) {
			puntPrima=puntatore;
			puntatore = puntatore.getNext();
			
		}

		puntPrima.setNext(n);
		
	}
	
	public int get(int i) {
		Nodo puntatore=head; 
		for (int j=0;j<i;j++) {
			puntatore=puntatore.getNext();
		}
		
		return puntatore.getValue();	
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder("[");
		Nodo puntatore = head;
		while (puntatore != null) {
			sb.append(puntatore);
			puntatore = puntatore.getNext();
			
		}
		sb.append("]");
		return sb.toString();
	}
	
	public void pop1() {
		Nodo puntatore=head;
		Nodo puntPrima = head;
		Nodo puntPrimaPrima= head;
		while (puntatore != null) {
			puntPrimaPrima=puntPrima;
			puntPrima=puntatore;
			puntatore = puntatore.getNext();
		}
		puntPrimaPrima.setNext(null);
	}
	
	public int size() {
		Nodo puntatore = head;
		int size=0;

		while (puntatore != null) {
			
			puntatore = puntatore.getNext();
			size++;
		}
		return size;
	}
	public void pop() {
		
		Nodo puntatore=head;
		
		head=puntatore.getNext();
		
	}
}
