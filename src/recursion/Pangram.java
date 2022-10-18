package recursion;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/

import java.util.HashSet;

public class Pangram {
    public static void main(String[] args) {
       // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";
        System.out.println(checkIfPanagram(sentence));
    }

    private static boolean checkIfPanagram(String sentence) {
        HashSet alphabet = new HashSet();
        for (int i : sentence.toCharArray())
            if (alphabet.add(i))
                if (alphabet.size() == 26)
                    return true;
        return false;
    }
}

