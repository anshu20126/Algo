package recursion;

public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(0));

    }
    public static int fib(int n) {
        if (n<0) {
            return -1;
        }
        if (n==0 || n==1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
