package s105;

public class MyList {
	private Node head;
	private int size = 0;
	
	public void add(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
			return;
		}
		
		Node cur = head;
		Node next = cur.getNext();
		
		while (next != null) {
			cur = next;
		}
		cur.setNext(node);

	}
	
	public int getSize() {
		Node cur = head;
		while(cur != null) {
			cur = cur.getNext();
			size++; //qua sto usando la cache
		}
		return size;
	}
	
	public int get(int nodeReference) {
		int value = 0;
		int index = 0;
		Node cur = head;
		while(index != nodeReference) {
			if (index == ( nodeReference - 1)) {
				value = cur.getValue();
				cur = cur.getNext();
				index++;
			} else {
				cur = cur.getNext();
				index++;
			}
		}
		return value;
	}
	
//	public int Head() { //trova head
//		return head.getValue();
//	}
//	
	public int getHead() { //ridà la head
		return head.getValue();
	}
	
//	public MyList popHead() { //pop the head
//		Node cur = head;
//		Node next = cur.getNext();
//		//Node next = cur.getNext();
//		MyList poppedList = new MyList();
//		while(cur != null) {
//			if (cur.getNext() == head) {
//				continue;
//			} else {
//				poppedList.add(cur.getValue());
//			}
//		}
//		return poppedList;
//	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		
		Node cur = head;
		while(cur != null) {
			sb.append(cur);
			cur = cur.getNext();
			//size++; qua sto usando la cache
		}
		
		sb.append("]");
		return sb.toString();
	}
}


//public static ArrayList<Integer> add(Integer value) {
//ArrayList<Integer>added = Node.createNode(value, null);
//return added;
//}
//
//public static Integer getNull() {
//Integer nullvalue = 0;
//ArrayList<Integer> nodes = Node.createNode(5, null);
//if (nodes.contains(null)) {
//	 nullvalue = nodes.get(0);
//}
//return nullvalue;
//}
//
//public static ArrayList<Integer> popTail() {
//ArrayList<Integer> nodes = Node.createNode(5, null);
//if (nodes.contains(null)) {
//	 //delete last;
//} //else continue
//return null;
//}





