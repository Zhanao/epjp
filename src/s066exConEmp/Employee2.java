package s066exConEmp;

public class Employee2 extends Person2 {
	private int salary;
	
	public Employee2 (String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }
    
    public int getSalary() {
    	return salary;
    }
    
    @Override
    public String toString( ) {
    	return "Employee " + salary + ", toString()=" + super.toString();
    }
}
