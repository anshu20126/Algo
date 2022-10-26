/*
package array;

public class FirstAndLastDigit {
    // Find the first digit
    public static int firstDigit(int[] arr) {
        // Remove last digit from number till only one digit is left
        for (int i : arr) {
            while (arr[i] >= 10)
                arr[i] /= 10;

        }
        return arr[i];
    }

    // Find the last digit
    public static int lastDigit(int[] arr) {
        // return the last digit
        for (int i : arr) {
            return (arr[i] % 10);
        }
    }

    // driver function
    public static void main(String[] args)
    {
        int [] arr = {22,31,22,41};
        System.out.println(firstDigit(arr) + " "
                + lastDigit(arr));
    }
}
*/
