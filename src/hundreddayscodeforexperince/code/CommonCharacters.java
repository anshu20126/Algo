package hundreddayscodeforexperince.code;

public class CommonCharacters {

    public static void main(String[] args) {
        String first = "abcbcd";
        String second = "cdefef";
        String common = commonCharacters(first, second);
        System.out.println("common characters in '" + first + "' and '" +
                second + "' are '" + common + "'");
    }

    public static String commonCharacters(String a, String b) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) str.append(a.charAt(i));
            }
        }
        return str.toString();
    }
}


