package recursion;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        /*In this problem we'll just calculate power of 4 to get n.
        4^x = n we need to find x. For that we'll use log.
        If the power is a whole number then it's true else false.*/
        double pow = Math.log(n)/Math.log(4);
        return pow==(int)pow;

       /* if (n <= 0)
            return false;
        if (n == 1)
            return true;
        if (n % 4 != 0)
            return false;
        return isPowerOfFour(n / 4);*/
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
    }
}
