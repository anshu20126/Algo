package array.leetcode.easy;

public class FindNum {
    public static void main(String[] args) {
        int[] inArray = {1, 2, 3, 4, 5, 6};
        int val =5;
        boolean result =linearSearch(inArray, val);
        System.out.println(result);
    }

    private static boolean linearSearch(int[] inArray, int value) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i]== value) {
                return true;
            }
        }
        return false;
    }
}
