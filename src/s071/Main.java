package s071;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();
		
		String s = poodle.getName();
		System.out.println(s);

		System.out.println(poodle);
		System.out.println(p2);
	}
}
