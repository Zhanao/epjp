package s105;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyListTest {
	
	private MyList myList;
	
	@BeforeEach
    private void init() {
        myList = new MyList();
    }
	
	@Test
    void emptyList() {
        assertThat(myList.getSize(), is(0));
    }
	
	@Test
	void MyListAdd() {
        myList.add(42);

        assertThat(myList.getSize(), is(1));
	}
	
	@Test
	void MyListAddAdd() {
        myList.add(42);
        myList.add(72);

        assertThat(myList.getSize(), is(2));
	}
	
	@Test
    void addThree() {
        myList.add(42);
        myList.add(Integer.MIN_VALUE);
        myList.add(0);

        assertThat(myList.getSize(), is(3));
    }

    @Test
    void getEmpty() {
        assertThrows(NullPointerException.class, () -> myList.getHead());
    }

    @Test
    void getEmptyClassic() {
        try {
            myList.getHead();
            fail("A NullPointerException was expected here");
        } catch (NullPointerException npe) {
        }
    }

    @Test
    void getOne() {
        myList.add(42);

        assertThat(myList.getHead(), is(42));
    }

    @Test
    void popEmpty() {
        assertThrows(NullPointerException.class, () -> myList.popHeadEst());
    }

    @Test
    void popOne() {
        myList.add(42);
        myList.popHeadEst();
        assertThat(myList.popHeadEst().getSize(), is(0));
    }

    @Test
    void getAfterPop() {
        myList.add(42);
        myList.add(12);
        myList.popHeadEst();

        assertThat(myList.popHeadEst().getHead(), is(12));
    }

}
