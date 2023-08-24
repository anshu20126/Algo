package hundreddayscodeforexperince.code;
public class CombineStrings {
    public static void main(String[] args) {
        String str1 ="abcde";
        String str2 ="12345";
        String output = combineString(str1,str2);
        System.out.println(output);
    }
    private static String combineString(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        int length = Math.min(str1.length(),str2.length());

        for (int i = 0; i <length ; i++) {
            result.append(str2.charAt(i)).append(str1.charAt(i));
        }

        if (str1.length()>length){
            result.append(str1.substring(length));
        } else if (str2.length()>length) {
            result.append(str2.substring(length));
        }

        return result.toString();
    }
}
