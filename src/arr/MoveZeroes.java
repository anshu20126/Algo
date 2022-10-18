package arr;

class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i :nums) {
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }}}

    public static void main(String[] args) {
        //int[] a = {0, 1, 0, 3, 12};
        int[] a ={0,1};
        System.out.println("Array after pushing zeros to the back: ");
        moveZeroes(a);
        for (int j : a) System.out.print(j + " ");
    }}