package hundreddayscodeforexperince.code;

import java.util.Arrays;

public class NameStartWithAFromStringArray {
    public static void main(String[] args) {
        String[] arr = {"Anil", "Anshu", "Kumar"};
        String[] nameStartWithA = Arrays.stream(arr)
                .filter(n -> n.startsWith("A")).toArray(String[]::new);
        System.out.println(Arrays.toString(nameStartWithA));
    }
}
