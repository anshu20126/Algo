package hundreddayscodeforexperince.code;

public class DivideNumber {
    public static void main(String[] args) {
        divide(23, 3);
    }

    public static void divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        int quotient = 0;
        int sign = 1;

        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        quotient *= sign;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + dividend);
    }
}

