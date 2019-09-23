package s066exConDip;

public class Main {
	public static void main(String[] args) {
		Person[] people = new Person[5];
		
        people[0] = new Employee();
        people[1] = new Employee();
        people[2] = new Consultant();
        people[3] = new Consultant();
        people[4] = new Consultant();
        
        String[] names = {"Tom", "Carol", "Alice", "John", "Dexter", "Andrea", "Catherine"};
        String[] surnames = {"Smith", "Wick", "Allister", "Morgan", "Buffet", "Stanley"};
        int[] wages = {1200, 1375, 1580, 1160, 2150, 1670, 1878};
        
        for(Person person : people) {
        	if (person instanceof Employee) {
            	System.out.println("This person is an employee");
        		Person.nameAndsurname(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)]);
        		Employee.wage(wages[(int) Math.round(Math.random()*6)]);
        	} else {
            	System.out.println("This person is a consultant");
        		Person.nameAndsurname(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)]);
        		Consultant.fee(wages[(int) Math.round(Math.random()*6)]);
        	}
        }
        
	}

}
