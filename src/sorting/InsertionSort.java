package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {4, 5, 1, 2, 8, 4, 9};
        insertionSort(array);
        for (int j : array) {
            System.out.print(j + "  ");
        }
    }

    // InsertionSort
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j = i;
            while (j > 0 && arr[j - 1] > temp) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
