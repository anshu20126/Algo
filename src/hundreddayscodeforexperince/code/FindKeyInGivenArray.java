package hundreddayscodeforexperince.code;

public class FindKeyInGivenArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 19, 23, 29, 50, 61, 81, 99};
        int key = 23;
        System.out.println(findElemnt(arr, key));
    }

    private static int findElemnt(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (key == arr[mid]) {
                return key;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

