package hundreddayscodeforexperince.code;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Anil";
        String reversed = reverseString(str);
        System.out.println("Reversed string: " + reversed);
    }

    private static String reverseString(String str) {
        int start = 0;
        int end = str.length() - 1;
        char[] charArray = str.toCharArray();

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}
