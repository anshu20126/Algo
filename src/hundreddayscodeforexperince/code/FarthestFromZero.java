package hundreddayscodeforexperince.code;

import java.util.TreeSet;

public class FarthestFromZero {
    public static void main(String[] args) {
        //int [] arr = {1,2,3,4,5,6,7,9};
        int[] arr = {5};
        int n = arr.length;
        int result = farthestFromZero(n, arr);
        System.out.println(result);

    }

    public static int farthestFromZero(int n, int[] arr) {
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            ts.add(arr[i]);
        }
        int maxV = ts.last();
        int minV = ts.first();

        if (Math.abs(minV) >= maxV) {
            return minV;
        }
        return maxV;
    }
}
