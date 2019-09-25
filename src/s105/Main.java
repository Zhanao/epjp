package s105;

public class Main {
	public static void main(String[] args) {
		MyList m1 = new MyList();
		
		m1.add(42);
		m1.add(77);
		//m1.add(82); 
		
		System.out.println(m1);
		System.out.println(m1.getSize());
		System.out.println(m1.get(2));
		System.out.println(m1.getHead());
		
	}

}
