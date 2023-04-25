package hundreddayscodeforexperince.code;

import java.util.Arrays;

class SplitArray {
	public static void main(String[] args) {
		int[] original = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int splitSize = 3;
		
		/* expected Output 
		[0, 1, 2]
		[3, 4, 5]
		[6, 7, 8]
		[9]
		*/
		System.out.println(Arrays.toString(splitArray(original, splitSize)));
	}
	public static int[][] splitArray(int[] arrayToSplit, int splitSize) {
		if (splitSize <= 0) {
			return null;  // just in case :)
		}
		int rest = arrayToSplit.length % splitSize;
		int split = arrayToSplit.length / splitSize + (rest > 0 ? 1 : 0);
		int[][] arrays = new int[split][];
		for (int i = 0; i < (rest > 0 ? split - 1 : split); i++) {
			arrays[i] = Arrays.copyOfRange(arrayToSplit, i * splitSize, i * splitSize + splitSize);
		}
		if (rest > 0) {
			arrays[split - 1] = Arrays.copyOfRange(arrayToSplit, (split - 1) * splitSize, (split - 1) * splitSize + rest);
		}
		return arrays;
	}
}


