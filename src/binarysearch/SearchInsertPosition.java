package binarysearch;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
           // if (target)
        }
        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {1,3,5,6};

        int target = 5;
        System.out.println(searchInsert(arr, target));
    }
}
