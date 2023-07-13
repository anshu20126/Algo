package array.leetcode.medium;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=study-plan-v2&envId=top-interview-150
public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        } return maxprofit;
    }

    public static void main(String[] args) {
        int [] prices ={7,1,5,3,6,4};
       // int [] prices ={1,2,3,4,5};
        int res =maxProfit(prices);
        System.out.println(res);
    }
}
