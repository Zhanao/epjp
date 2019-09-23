package s066exConEmp;

public class Consultant2 extends Person2  {
	private int daily;
	
	public Consultant2 (String name, String surname, int daily) {
        super(name, surname);
        this.daily = daily;
    }
    
    public int getDaily() {
    	return daily;
    }
    
    @Override
    public String toString( ) {
    	return "Consultant " + daily + ", toString()=" + super.toString();
    }

}
