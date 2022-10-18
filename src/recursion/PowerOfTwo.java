package recursion;

//https://leetcode.com/problems/power-of-two/
public class PowerOfTwo {
    public static void main(String[] args) {
        int number = 4;
        boolean result = isPowerOfTwo(number);
        System.out.println(result);

    }

    public static boolean isPowerOfTwo(int n) {
        /*if (n == 1) {
            return true;
        } else if (n % 2 != 0 || n == 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }*/
        return n > 0 && (n & n - 1) == 0;}
    }

