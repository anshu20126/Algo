package hundreddayscodeforexperince.code;

public class RepeatedString {

    public static void main(String[] args) {

        String[] arr = {"apple", "orange", "banana", "apple", "grapes", "banana", "kiwi", "orange", "orange"};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("The string '" + arr[i] + "' is repeated.");
                }
            }
        }
    }
}
