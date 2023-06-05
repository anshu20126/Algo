package string.leetcode.easy;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/?envType=study-plan-v2&id=top-interview-150
public class IndexoftheFirstOccurrenceString {
    public static int strStr(String haystack, String needle) {
        /*if (haystack.contains(needle)){
            return haystack.indexOf(needle);
        }*/

        int haylength=haystack.length();
        int needlelength=needle.length();
        if(haylength<needlelength) {
            return -1;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++){
            int j=0;
            while(j<needle.length() && haystack.charAt(i+j)==needle.charAt(j))
                j++;
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        //String haystack = "sadbutsad", needle = "sad";//output 0
        String haystack = "leetcode", needle = "leeto";//0utput -1
        int result = strStr(haystack, needle);
        System.out.println(result);
    }
}
