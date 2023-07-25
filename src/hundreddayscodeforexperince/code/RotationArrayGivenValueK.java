package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class RotationArrayGivenValueK {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        int[] rotatedArray = rotateArray(nums, k);

        System.out.println("Original Array: " + Arrays.toString(nums));
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }

    private static int[] rotateArray(int[] nums, int k) {
        int n = nums.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }
        return rotated;
    }
}
