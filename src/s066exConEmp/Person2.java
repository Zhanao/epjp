package s066exConEmp;

public class Person2 {
	private String name;
	private String surname;

    public Person2(String name, String surname) { //costruttore
    	//super(); questo non serve a molto
        this.name = name;
        this.surname = surname;
    }
    
    @Override
    public String toString() {
        return name + ", " + surname;
    }

}
