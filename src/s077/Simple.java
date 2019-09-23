package s077;

public class Simple {
	public int negate(int value) {
		if (value == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("Can't negate MIN_VALUE");
		}
		return -value;
	}

public int negate1(int value) {
	if (value == Integer.MIN_VALUE) {
		throw new IllegalArgumentException("Can't negate MIN_VALUE");
	} // è un eccezione unchecked quindi non devo dichiararla
		// oppure posso usare "throw new Exception" ma la devo dichiarare in
		// "public int negate(int value) throws Exception {"
	return -value;
}

public static void main(String[] args) {
	Simple simple = new Simple();
	int x=0;
	try { // se non srivo try.... mi esce un errore
		x = simple.negate(Integer.MIN_VALUE);
	}catch  (Exception e) {
		System.out.println("Couldn't negate: " + e.getMessage());
		return;
		
	}
	
	System.out.println(x); // mi tirerà l eccezione
}






}

