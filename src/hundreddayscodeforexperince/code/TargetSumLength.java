package hundreddayscodeforexperince.code;
public class TargetSumLength {
    public static void main(String[] args) {
       // int target = 7;
       // int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 4;
        int[] nums = {1,4,4};
        System.out.println(findLength(nums, target));
    }
    public static int findLength(int[] arr, int target) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
