package array;

public class IsUnique {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,5,6};
        boolean result = isUnique(intArray);
        System.out.println(result);
    }

    private static boolean isUnique(int[] intArray) {
        for (int i = 0; i <intArray.length ; i++) {
            for (int j = i+1; j <intArray.length ; j++) {
                if (intArray[i]!=intArray[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
