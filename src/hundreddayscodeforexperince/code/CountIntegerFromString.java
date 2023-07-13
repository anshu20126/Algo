package hundreddayscodeforexperince.code;

public class CountIntegerFromString {
    public static void main(String[] args) {
        String input = "1,2,3,4";
        int sum = sumOfNumber(input);
        System.out.println("Sum of numbers:" + sum);
    }

    private static int sumOfNumber(String input) {
        String[] numbers = input.split(",");
        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;
    }
}
