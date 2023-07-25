package hundreddayscodeforexperince.code;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 2};
        int[] duplicates = findDuplicate(arr);
        System.out.println(Arrays.toString(duplicates));
    }
    private static int[] findDuplicate(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        int[] result = new int[duplicates.size()];
        int index = 0;
        for (int num : duplicates) {
            result[index++] = num;
        }
        return result;
    }
}
