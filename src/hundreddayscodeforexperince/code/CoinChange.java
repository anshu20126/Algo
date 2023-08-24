package hundreddayscodeforexperince.code;

//https://leetcode.com/problems/coin-change/
public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        if (amount < 0) {
            return -1;
        }
        if (amount == 0) {
            return 0;
        }
        int cc = -1;

        for (int i = 0; i < coins.length; i++) {
            int coin = coinChange(coins, amount - coins[i]);
            if (coin >= 0) cc = cc < 0 ? coin + 1 : Math.min(cc, coin + 1);
        }
        return cc;
    }

    public static void main(String[] args) {
        int[] coin = {1, 2, 5};
        int amount = 11;
        int[] coins1 = {2};
        int amoint1 = 2;
        int result = coinChange(coins1, amoint1);
        System.out.println(result);
    }
}
