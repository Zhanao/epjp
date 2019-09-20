package aprovepersonali;

public class parseInt {
	int parseInt(String s) {
		double sum=0;
		char c;
		double n;
		for (int i=0; i<s.length();i++) {
			c=s.charAt(s.length()-1-i);
			if(c>='0' && c<='9') {
				n = (c-'0')*Math.pow(10, i);
				sum=sum+n;
			}else {
				return 0;
			}
			
		}
	}

}
