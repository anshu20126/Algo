package hundreddayscodeforexperince.code;

public class ArrayComparison {
    public static <T> boolean areArraysEqual(T[] array1, T[] array2) {
        if (array1 == null && array2 == null) {
            return true;
        }
        if (array1 == null || array2 == null) {
            return false;
        }
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {1, 2, 3, 4, 5};

        boolean areEqual = areArraysEqual(array1, array2);

        if (areEqual) {
            System.out.println("The two arrays are equal");
        } else {
            System.out.println("The two arrays are not equal");
        }
    }
}
