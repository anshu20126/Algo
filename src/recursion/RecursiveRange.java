package recursion;

public class RecursiveRange {
    public static void main(String[] args) {
        System.out.println(5);
    }

    public static int recursiveRange(int num) {
        if (num <= 0) {
            return 0;
        }
        return num + recursiveRange(num - 1);
    }
}
