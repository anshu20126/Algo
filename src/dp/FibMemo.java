package dp;

import java.util.ArrayList;
import java.util.HashMap;

public class FibMemo {
    public static void main(String[] args) {
        int n = 6;
        HashMap<Integer, Integer> memo = new HashMap<>();
        int result = fibMemo(n, memo);
        System.out.println(result);
        System.out.println(fibTab(6));
    }

    public static int fibMemo(int n, HashMap<Integer, Integer> memo) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, (fibMemo(n - 1, memo) + fibMemo(n - 2, memo)));
        }
        return memo.get(n);
    }

    public static int fibTab(int n) {
        ArrayList<Integer> tb = new ArrayList<>();
        tb.add(0);
        tb.add(1);
        for (int i = 2; i <=n-1 ; i++) {
            int n1=tb.get(i-1);
            int n2=tb.get(i-2);
            tb.add(n1+n2);
        }
        return tb.get(n-1);
    }
}
