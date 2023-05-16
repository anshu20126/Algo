package string.leetcode.easy;

//https://leetcode.com/problems/length-of-last-word/?envType=study-plan-v2&id=top-interview-150
public class LengthofLastWord {
    public static void main(String[] args) {
        String s = "Hello World";//5
        int result = lengthOfLastWord(s);
        System.out.println(result);
    }

    public static int lengthOfLastWord(String string) {
        int count = 0;
        String humHaiYhaKeHero = string.trim();
        for (int i = humHaiYhaKeHero.length() - 1; i >= 0; i--) {
            if (humHaiYhaKeHero.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;
    }
}
