package hundreddayscodeforexperince.code;

public class StringReversal {
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        
        // Recursive case: reverse the substring excluding the first character
        String reversedSubstring = reverseString(str.substring(1));
        
        // Append the first character to the reversed substring
        return reversedSubstring + str.charAt(0);
    }
    
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
