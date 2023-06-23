package hundreddayscodeforexperince.code;

public class BinarySerach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        int start =0,end =arr.length;
       // int res = binarySerach(arr, target);
        System.out.println(binary(arr,start,end,target));

       // System.out.println(res);
    }

    public static int binarySerach(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    //using recursion
    public static int binary(int[] arr, int start, int end, int target) {
        int mid = start + (end - start) / 2;
        if (start > end) {
            return -1;
        }
        if (arr[mid] == target) {
            return mid;
        } else if (target > arr[mid]) {
            return binary(arr, mid + 1, end, target);
        } else {
            return binary(arr, start, mid - 1, target);
        }
    }
}
