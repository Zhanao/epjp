package s066exConEmp;

public class Main2 {
public static void main(String[] args) {
	Person2[] people = new Person2[5];
	
    String[] names = {"Tom", "Carol", "Alice", "John", "Dexter", "Andrea", "Catherine"};
    String[] surnames = {"Smith", "Wick", "Allister", "Morgan", "Buffet", "Stanley"};
    int[] wages = {1200, 1375, 1580, 1160, 2150, 1670, 1878};
    int[] dailys = {300, 752, 550, 850, 600, 625, 1200};
	
    
    people[0] = new Employee2(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)], wages[(int) Math.round(Math.random()*6)]);    
    people[1] = new Employee2(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)], wages[(int) Math.round(Math.random()*6)]); 
    people[2] = new Consultant2(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)], dailys[(int) Math.round(Math.random()*6)]); 
    people[3] = new Consultant2(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)], dailys[(int) Math.round(Math.random()*6)]); 
    people[4] = new Consultant2(names[(int) Math.round(Math.random()*6)], surnames[(int) Math.round(Math.random()*5)], dailys[(int) Math.round(Math.random()*6)]); 

    
    for (Person2 person2 : people) {
        System.out.println(people);
    }
    
    for(Person2 person2 : people) {
    	if (person2 instanceof Employee2) {
        	System.out.println((Employee2)person2.getSalary());
    	} else {
        	System.out.println(Consultant2)person2.getDaily());
    		}
    	}

	}
}
