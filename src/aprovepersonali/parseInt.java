package aprovepersonali;

public class parseInt {
	public static void main(String[] args) {
		String s = "1234";
		parseInt p= new parseInt();
		System.out.println(p.parseInto(s));
	}
	 int parseInto(String s) {
		double sum=0;
		char c='a';
		double n=0;
		for (int i=0; i<s.length();i++) {
			c=s.charAt(s.length()-1-i);
			if(c=='-') {
				return (int)-sum;
				
			}
			if(c>='0' && c<='9') {
				n = (c-'0')*Math.pow(10, i);
				sum=sum+n;
			}else {
				return 0;
			}
			
		}
		return (int)sum;
	}
	 
	 String ripNum(String s) {
		 int c=0;
		 int [][] contatore;
		 StringBuilder temp = new StringBuilder();
		 for (int i = 0; i < s.length(); i++) {
			 for (int j = i; j<s.length();j++) {
				 if(s.charAt(i)==s.charAt(j)){
				contatore[1][c]=;
						contatore[2][c]=;
				 }
			 }
			 
		 }
		 
		 
		 return "Il numero riptuto piu' volte e'"+""+"per"+""+"volte";
		 
		 
	 }

}
