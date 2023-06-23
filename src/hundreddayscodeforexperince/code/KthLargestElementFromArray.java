package hundreddayscodeforexperince.code;

public class KthLargestElementFromArray {
    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 8, 10, 9};
        int k = 10;
        int res = findKthLargest(arr, k);
        System.out.println(res);
    }

    private static int findKthLargest(int[] arr, int k) {
        if (k < 1 || k > arr.length) {
            return -1; // Invalid value of k
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (true) {
            int pivotIndex = partition(arr, left, right);
            int kthLargestIndex = arr.length - k;
            
            if (pivotIndex == kthLargestIndex) {
                return arr[pivotIndex]; // Found the kth largest element
            } else if (pivotIndex < kthLargestIndex) {
                left = pivotIndex + 1; // Search in the right partition
            } else {
                right = pivotIndex - 1; // Search in the left partition
            }
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
