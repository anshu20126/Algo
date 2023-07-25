package hundreddayscodeforexperince.code;

public class ConsecutiveNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array with consecutive numbers
        System.out.println(checkConsecutive(arr));
    }
    public static boolean checkConsecutive(int[] arr) {
        int n = arr.length;
        if (n == 0) {
            return false; // Empty array is not considered consecutive
        }

        // Find the minimum and maximum elements in the array
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // If the difference between max and min is equal to (n-1), then the array is consecutive
        return (max - min == n - 1);
    }
}
