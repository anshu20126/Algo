package recursion;

public class Factorial {
    public static void main(String[] args) {
    System.out.println(factorial(3));
    }
    static int factorial(int number){
        if(number<=1){
            return 1;
        }
        return number*factorial(number-1);
    }
}
