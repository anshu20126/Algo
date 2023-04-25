package leetcodeTopInterviewQuestion;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Approach
 *
 * Use sliding window with hashset, use left and right pointers to move the window .
 * If the set doesn't contains character then first add into the set and calculate the maxLength hand-in-hand...
 * if character already present in the set that means you have to move your sliding window by 1 , before that you have to remove all the characters that are
 * infront of the character that is present already in window before.
 * Now you have to remove that character also and move the left pointer and also add the new character into the set.
 * THAT'S ALL........EASY APPROACH USING SIMPLE HASHSET+SLIDING WINDOW
 */
class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0;right<s.length();right++){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLength=Math.max(maxLength,right-left+1);

            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));left++;
                set.add(s.charAt(right));
            }

        }
        return maxLength;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";//output =3
        System.out.println(lengthOfLongestSubstring(s));
    }
}