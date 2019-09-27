package aprovepersonali;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MergeSortedTest {

	@Test
	void mergesortedtest() {
		MergeSorted ms= new MergeSorted();
		int[] left= {1,2,3};
				int[] right= {1,2,3,4,5,6};
				System.out.println(ms.mergeSorted(left, right));
	}

}
