package arr;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwoArray {
    static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            int v = nums[i];
            int x = target - v;
            if (m.containsKey(x)) {
                return new int[] {m.get(x), i};
            }
            m.put(v, i);
        }
        return null;

    }
    public static void main(String[]args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(twoSum(nums, target));


    }
}
