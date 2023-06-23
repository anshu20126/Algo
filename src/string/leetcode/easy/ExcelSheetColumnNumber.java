package string.leetcode.easy;

//https://leetcode.com/problems/excel-sheet-column-number/?envType=featured-list&envId=top-interview-questions
public class ExcelSheetColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int sum = 0;
        for (int i = 0; i <n; i++) {
            sum = (int) (sum + Math.pow(26,n-1-i) * ((int)(columnTitle.charAt(i) -64)));
        }
        return sum;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";//output=1
        int result = titleToNumber(columnTitle);
        System.out.println(result);
    }
}
