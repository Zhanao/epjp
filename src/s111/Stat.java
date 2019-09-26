package s111;

public class Stat {
	private char mostpopular;
	private int numerosity;
	private int howmany;
	Stat(char mp, int num, int h){
		mostpopular=mp;
		numerosity=num;
		howmany=h;
		
	}
	
	public String toString() {
		return " Il più popolare della stringa è " + this.mostpopular +" che si ripete "+ this.numerosity+" volte. Numero di caratteri differenti presenti nella stringa "+this.howmany + "." ;
	}

}
