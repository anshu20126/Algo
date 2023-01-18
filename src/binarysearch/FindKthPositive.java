package binarysearch;
//https://leetcode.com/problems/kth-missing-positive-number/

public class FindKthPositive {

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        //Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...].
        // The 5th missing positive integer is 9.
        System.out.print(findKthPositive(arr, k));
    }

    public static int findKthPositive(int[] arr, int k) {
        /*int n = arr.length;
        int start = 0, end = n - 1;

        int missing = compute(arr[n - 1], n);

        //example tc-2 =>arr =[1,2,3,4],k=2,res=6
        if (missing == 0) {
            return arr[n - 1] + k;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            missing = compute(arr[mid], mid + 1);
            if (missing >= k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        // example tc =>arr =[3,4,5,6],k=2,res=2
        if (end == -1) {
            return k;
        }
        return arr[end] + k - compute(arr[end], end + 1);
    }

    private static int compute(int actual, int expected) {
        return actual - expected;
    }*/
        int i = 0, j = arr.length;
        while (i < j) {
            int m = i + (j - i) / 2;
            if (arr[m] - (m + 1) >= k)
                j = m;
            else
                i = m + 1;
        }
        return i + k;
    }
}

   /* optimize approach:- O(logN) binary search :-

        Step 1:- find how many elem we have to search;
        search = arr[m]-m-1
        we subtract the elem value by at its index and -1 bcos we are considering zero based index.
        Step 2:- if our serach < k we check in right side, thats why we move s to the right side
        Step 3:- if our serach >= k we check in rleft side, we move searching range towards the left side;
        Step 4:- at the end add k+s (adding s here in place of end bcos we want ceiling value like that elem is missing after the start elm not before )

        int s = 0;
        int e = arr.length-1;

        while(s <= e){
        int m = s+(e-s)/2;
        int search = arr[m]-m-1;
        if( search<k){
        s = m+1;
        }else{
        e = m-1;
        }
        }
        return k+s;
        }
*/