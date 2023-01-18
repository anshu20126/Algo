package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 2, 5, 8, 9};
        selectionSort(arr);
        for (int j : arr) {
            System.out.print(j + "  ");
        }
    }
    static void selectionSort(int[] a) {
        for (int j = 0; j < a.length; j++) {
            int minimumIndex = j;
            for (int i = j + 1; i < a.length; i++) {
                if (a[i] < a[minimumIndex]) {
                    minimumIndex = i;
                }
            }
            if (minimumIndex != j) {
                int temp = a[j];
                a[j] = a[minimumIndex];
                a[minimumIndex] = temp;
            }
        }
    }
}
