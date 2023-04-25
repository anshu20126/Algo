package hundreddayscodeforexperince.code;
// Java program to count occurrences of an element

class CountOccurrences {
    static int binarySearch(int arr[], int start, int end, int x) {
        if (end < start)
            return -1;

        int mid = start + (end - start) / 2;

        // If the element is present at the middle itself
        if (arr[mid] == x)
            return mid;

        // If element is smaller than mid, then it can only be present in left sub array
        if (arr[mid] > x)
            return binarySearch(arr, start, mid - 1, x);

        // Else the element can only be present in right subarray
        return binarySearch(arr, mid + 1, end, x);
    }

    // Returns number of times x occurs in arr[0..n-1]
    static int countOccurrences(int arr[], int n, int x) {
        int ind = binarySearch(arr, 0, n - 1, x);

        // If element is not present
        if (ind == -1)
            return 0;
        // Count elements on left side.
        int count = 1;
        int left = ind - 1;
        while (left >= 0 && arr[left] == x) {
            count++;
            left--;
        }
        // Count elements on right side.
        int right = ind + 1;
        while (right < n && arr[right] == x) {
            count++;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7, 8, 8};
        int n = arr.length;
        int x = 2;
        System.out.print(countOccurrences(arr, n, x));
    }
}

// This code is contributed
// by ChitraNayal
/*public class CountOccurrences {
	public static void main(String[] args) {
		int[] nums = {3, 2, 5, 8, 9, 2, 12, 54, 62, 5, 78, 80};
		int target = 2;
		int count = count(nums, target);
		System.out.println("The number of occurrences of " + target + " is: " + count);
	}

	private static int count(int[] nums, int target) {
		int count = 0;
		for (int num : nums) {
			if (num == target) {
				count++;
				if (count == nums.length) {
					break;
				}
			}
		}
		return count;
	}
}*/

