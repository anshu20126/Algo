package array;

public class MissingNumberFromArray {
    static int missingNumber(int[] array, int n) {
        int sumOfNumber = (n * (n + 1)) / 2;
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        return sumOfNumber - sum;
    }

    public static void main(String[] args) {
       int n = 8;
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int missingNumber = missingNumber(a, n);
        System.out.println("Missing Number is = " + missingNumber);
    }
}
