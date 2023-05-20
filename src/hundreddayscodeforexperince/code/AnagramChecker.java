package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean checkAnagrams(String s1,String s2){
        //Convert string to character arrays
        char[] charArray1=s1.toCharArray();
        char[] charArray2=s2.toCharArray();

        //Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

       //Compare the sorted character arrays
        return Arrays.equals(charArray1,charArray2);
    }

    public static void main(String[] args) {
        String s1= "aaagmnrs";
        String s2 ="anagrams";
        boolean res=checkAnagrams(s1,s2);
        System.out.println(" Are the Strings anagrams? " +res);
    }
}
