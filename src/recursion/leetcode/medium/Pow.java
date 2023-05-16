package recursion.leetcode.medium;
//https://leetcode.com/problems/powx-n/description/
public class Pow {
    public static void main(String[] args) {
     double x = 2.00000; int n = 10;
     System.out.println(myPow(x,n));
    }
    public static double myPow(double x, int n) {
    // return Math.pow(x,n);
        if(n == 0)
            return 1;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        double ans = (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);

        return ans > 100000 ? 0.0 : ans;
    }
}
