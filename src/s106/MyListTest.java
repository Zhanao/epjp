package s106;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyListTest {

	@Test
	void add() {

		System.out.println("Test dell add");

		MyList ml = new MyList();
		System.out.println(ml.toString());
		ml.add(3);
		System.out.println(ml.toString());
		ml.add(7);
		System.out.println(ml.toString());
		System.out.println("");
	}

	@Test
	void get() {

		System.out.println("Test dell get");

		MyList ml = new MyList();
		ml.add(3);
		ml.add(7);
		ml.add(8);
		ml.add(3);
		int i = 1;
		System.out.println("il valore alla posizione " + i + " è " + ml.get(i));
		System.out.println("");

	}

	@Test
	void string() {
		System.out.println("Test dell toString");

		MyList ml = new MyList();
		ml.add(3);
		ml.add(7);
		ml.add(8);
		ml.add(3);

		System.out.println(ml.toString());
		System.out.println("");

	}

	@Test
	void pop1() {
		System.out.println("Test dell pop1");

		MyList ml = new MyList();
		ml.add(3);
		ml.add(7);
		ml.add(8);
		ml.add(3);
		System.out.println("lista originale " + ml.toString());
		ml.pop1();
		System.out.println("list dopo il pop1" + ml.toString());
		System.out.println("");

	}

	@Test
	void size() {
		System.out.println("Test dell size");
		MyList ml = new MyList();
		ml.add(3);
		ml.add(7);
		ml.add(8);
		ml.add(3);
		System.out.println("la dimensione della mia myList è " + ml.size());
		System.out.println("");
	}

	@Test
	void pop() {
		System.out.println("Test dell pop");
		MyList ml = new MyList();
		ml.add(3);
		ml.add(7);
		ml.add(8);
		ml.add(3);
		
		System.out.println("lista originale " + ml.toString());
		ml.pop();

		System.out.println("la dimensione della mia myList è " + ml.size());
		System.out.println(ml.toString());
		System.out.println("");

	}

}
