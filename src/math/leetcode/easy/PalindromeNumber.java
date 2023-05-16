package math.leetcode.easy;

//https://leetcode.com/problems/palindrome-number/?envType=study-plan-v2&id=top-interview-150
public class PalindromeNumber {
    public static void main(String[] args) {
        //int x = 121;//true
        //int x =-121;//false
        int x = 10;//false
        boolean result = isPalindrome(x);
        System.out.println(result);
    }
    public static boolean isPalindrome(int x) {
       /* String s = String.valueOf(x);
        int n = s.length();

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }*/
        if(x<0)
            return false;
        int temp=x;
        int sum=0;
        while(x!=0){
            sum=(sum*10)+(x%10);
            x=x/10;
        }
        return (temp==sum);
    }
}

