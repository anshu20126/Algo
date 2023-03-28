package array;

//https://www.geeksforgeeks.org/find-the-largest-three-elements-in-an-array/
//Input: arr[] = {10, 4, 3, 50, 23, 90}
//Output: 90, 50, 23
public class PrintLargest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        int n = arr.length;
        printThreelargest(arr, n);
    }

    private static void printThreelargest(int[] arr, int n) {
        int first, second, third;
        //There should be atleast three element
        if (n < 3) {
            System.out.println("Invalid input");
        }
        third = first = second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            // If current element is greater than first
            if (arr[i] > first) {
                third = second;
                second = first;
                first = arr[i];
            }
            // If arr[i] is in between first and second then update second
            else if (arr[i] > second) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third)
                third = arr[i];
        }
        System.out.println("Three largest elements are " + first + " " + second + " " + third);
    }
}

