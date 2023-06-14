package array.leetcode.easy;
//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
       int maxProfit =0;
       int minPrice =Integer.MAX_VALUE;
        for (int i = 0; i <prices.length ; i++) {
            if (prices[i]<minPrice){
                minPrice=prices[i];//1
            }
            if (prices[i]-minPrice>maxProfit){
                maxProfit=prices[i]-minPrice;
            }
        }
       return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices ={7,1,5,3,6,4};//output 5
        int[] prices1 ={7,6,4,3,1};//output 0
        System.out.println(maxProfit(prices1));
    }
}
