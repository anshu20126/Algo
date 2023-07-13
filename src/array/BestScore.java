package array;

/*Best Score
        Given an array, write a function to get first, second best scores from the array.
        Array may contain duplicates.
        Example
        myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
        firstSecond(myArray) // 90 87*/

import java.util.Arrays;
import java.util.Collections;

public class BestScore {
    static String firstSecond(Integer[] myArray) {
        Arrays.sort(myArray, Collections.reverseOrder());
        int first = myArray[0];
        Integer second = null;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] != first) {
                second = myArray[i];
                break;
            }
        }
        return first + " " + second;
    }

    public static void main(String[] args) {
     Integer[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
     System.out.println(firstSecond(myArray));
    }
}
