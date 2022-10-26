/*
package binarysearch;

public class CountOfElement {
    public static void main(String[] args) {
        int arr[] = {1, 1, 3, 3, 5, 5, 5, 5, 5, 9, 9, 11};
        int n = arr.length;
        int x = 1;
        int firstIndex = binarySearch(arr, n, x, true);
        if (firstIndex == -1) {
            System.out.print(x, 0);
        } else {
            int lastIndex = binarySearch(arr, n, x, false);
            System.out.print(x, lastIndex - firstIndex + 1);
        }
    }

    private static int binarySearch(int[] arr, int n, int x, boolean searchFirst) {
        int low = 0, high = n - 1, result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                result = mid;
                if (searchFirst) {
                    high = mid - 1; //Go on searching towards left
                } else {
                    low = mid + 1;//Go on searching towards right
                }
                else (x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return result;
    }
}
// Not optimise
  */
/*  private static int countOfElement(int[] arr, int n, int x) {
        int count =0;
        for (int i:arr) {
            if(arr[i]==x){
                count=count+1;
            }
 }
        return count;
    }*//*


*/
