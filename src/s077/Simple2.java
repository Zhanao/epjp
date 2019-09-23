package s077;



public class Simple2 {
	public static int negate2(int value)throws MyNegateException {
		if (value == Integer.MIN_VALUE) {
			throw new MyNegateException(Integer.MAX_VALUE);
		}
		return -value;
	}

	class MyNegateException extends Exception{
		private int alternativeValue;
		
		public MyNegateException(int alternativeValue) {
			this.alternativeValue = alternativeValue;
		}
		public int getAlternativeValue() {
			return alternativeValue;
		}
	}
 public static void main(String[] args) {
	 Simple2 simple = new Simple2();
	 System.out.println("Nagate "+ Integer.MIN_VALUE);
	 try {
		 int x = Simple2.negate2(Integer.MIN_VALUE);
		 System.out.println("My value negate is; " + x);
		 
	 } catch ()
 }
}
