package array;

public class FindNum {
    public static void main(String[] args) {
        int[] inArray = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(inArray, 5));
    }

    private static boolean linearSearch(int[] inArray, int value) {
        for (int i = 0; i < inArray.length; i++) {
            if (inArray[i] == value) {
                return true;
            }
        }
        return false;
    }
}
