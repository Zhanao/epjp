package aprovepersonali;

public class MergeSorted {

	public int[] mergeSorted(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		int j = 0;
		int k = 0;
		for (int i = 0; i < result.length; i++) {

			if (left[j] >= right[k] ) {

				result[i] = right[k];

				k += 1;
				if (k>right.length) {
					k=0;
				}
				
			} else {
				result[i] = left[j];
				j += 1;
				if (j>left.length) {
					j=0;
				}
				
			}

		}

		return result;
	}
}