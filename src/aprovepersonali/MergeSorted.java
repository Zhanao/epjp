package aprovepersonali;

public class MergeSorted {
	int[] result;

	public int[] mergeSorted(int[] left, int[] right) {
		result = new int[left.length + right.length];
		int l = 0;
		int r = 0;
		
		for (int i = 0; i < result.length; i++) {
			if (r >= right.length) {
				result[i] = left[l];
				l += 1;
				continue;
			}
			if (l >= left.length) {
				result[i] = right[r];
				r += 1;
				continue;
			}

			if (left[l] >= right[r]) {

				result[i] = right[r];

				r += 1;

			} else {
				result[i] = left[l];
				l += 1;

			}

		}

		return result;
	}
//	public String toString(){
//
//			
//		
//		
//		return result;
//	}
}