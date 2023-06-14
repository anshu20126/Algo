package array.leetcode.easy;
//https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int start = 0;
        int end =flowerbed.length;
        int mid =start + (end-start)/2;
        if (n==flowerbed[mid]) return true;
        else if (n>flowerbed[mid]) {
            start=mid+1;
            return true;
        }
        else if (n<flowerbed[mid]){
            end =mid-1;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
