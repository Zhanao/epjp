package ex;

public class Merging {
	public static void main(String[] args) {
		int[] first = {1,2,4,6};
		int[] second = {3,4,5,6};
		int[] merged = mergeSorted(first, second);
		System.out.println(merged[0] + " " + merged[1] + " " + merged[2] + " " + merged[3] + " " + merged[4] + " " + merged[5] + " " + merged[6] + " " + merged[7]);

	}
	
	public static int[] mergeSorted(int[] firstArray, int[] secondArray) {
		int[] mergedArray = new int[firstArray.length + secondArray.length];
		mergedArray[mergedArray.length -1] = Math.max(firstArray[firstArray.length - 1], firstArray[firstArray.length - 1]);
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		
		while (i < firstArray.length && j < secondArray.length) {
			if (firstArray[i] <= secondArray[j]) {
				mergedArray[k] = firstArray[i];
				k++;
				i++;
			} else if (firstArray[i] >= secondArray[j]) {
				mergedArray[k] = secondArray[j];
				k++;
				j++;
			}
		}
		
		return mergedArray;
	}

}
