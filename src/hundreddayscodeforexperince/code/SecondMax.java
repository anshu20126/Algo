package hundreddayscodeforexperince.code;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 2, 7, 10, 6};
        int secondLargest = findSecondLargest(array);
        System.out.println("Second Largest Element: " + secondLargest);
    }
    private static int findSecondLargest(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Not Valid");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];

            }
        }
        return secondMax;
    }
}
