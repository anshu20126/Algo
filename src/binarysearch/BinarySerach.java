package binarysearch;

public class BinarySerach {
    public static int binarySearch(int[] a, int n, int x){
        int start =0,end =n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(x==a[mid]) {
                return mid;
            }
            else if (x<a[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        int n =arr.length;
        int x=10;
        System.out.println((binarySearch(arr,n,x)));

    }
}
