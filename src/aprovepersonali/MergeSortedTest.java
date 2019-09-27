package aprovepersonali;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MergeSortedTest {

	@Test
	void mergesortedtest() {
		MergeSorted ms = new MergeSorted();
		int[] left = { 1, 2, 3 };
		int[] right = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Merge test: " + Arrays.toString(ms.mergeSorted(left, right)));
		int[] expected = { 1, 1, 2, 2, 3, 3, 4, 5, 6 };
		assertArrayEquals(expected, ms.mergeSorted(left, right));
	}

	@Test
	void mergevoidtest() {
		MergeSorted ms = new MergeSorted();
		int[] left = { 1, 2, 3, 4, 5, 6 };
		int[] right = {};
		int[] expected = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Merge test void: "+Arrays.toString(ms.mergeSorted(left, right)));
		assertArrayEquals(expected, ms.mergeSorted(left, right));
	}
	
	@Test
	void mergebothvoidtest() {
		MergeSorted ms = new MergeSorted();
		int[] left = {};
		int[] right = {};
		int[] expected = {};
		System.out.println("Merge test void: "+Arrays.toString(ms.mergeSorted(left, right)));
		assertArrayEquals(expected, ms.mergeSorted(left, right));
	}
	
	
	
}