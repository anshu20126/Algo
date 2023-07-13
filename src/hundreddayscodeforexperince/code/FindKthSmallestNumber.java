package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindKthSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, -1, -1, -1, 2, -1, 4, 5, 6, 7};
        int k = 3;

        int kthSmallest = findKthSmallest(arr, k);
        System.out.println("Kth Smallest Element: " + kthSmallest);
    }

    public static int findKthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        Set<Integer> distinctElement = new HashSet<>();
        for (int num : arr) {
            if (distinctElement.add(num)) {
                k--;
                if (k == 0) {
                    return num;
                }
            }
        }
        return -1;
    }
}
