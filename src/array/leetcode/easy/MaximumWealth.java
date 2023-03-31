package array.leetcode.easy;

public class MaximumWealth {

    public static int maximumWealth(int[][] accounts) {
        int row= accounts.length;
        int column= accounts[0].length;
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < row; i++) {
            int sum=0;
            for(int j=0; j<column; j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
/*/int sum=0;
    int maxi=0;
        for(int i=0;i<accounts.length;i++){
        sum=0;
        for(int j=0;j<accounts[i].length;j++){
            sum += accounts[i][j];
        }
        if(maxi<sum){
            maxi=sum;
        }
    }
        return maxi;*/


    public static void main(String[] args) {
        int[][] accounts ={{1,2,3},{3,2,1}};
        int result = maximumWealth(accounts);
        System.out.print(result);
    }
}
