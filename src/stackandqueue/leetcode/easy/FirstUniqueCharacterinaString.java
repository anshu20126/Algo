package stackandqueue.leetcode.easy;

import java.util.HashMap;

//https://leetcode.com/problems/first-unique-character-in-a-string/
public class FirstUniqueCharacterinaString {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        // If the character exists, its frequency is incremented by 1
        // If the character doesn't exist in the HashMap, it is added with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (mp.containsKey(s.charAt(i))) {
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            } else {
                mp.put(s.charAt(i), 1);
            }
        }
        // If the frequency is 1, it means the character is unique, else return -1
        for (int i = 0; i < s.length(); i++) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";//output 0
        String s1 = "loveleetcode";//output 2
        String s2 = "aabb";//output -1
        System.out.println(firstUniqChar(s));
    }
}
