package hundreddayscodeforexperince.inetviewGivenQuestion;

public class VariableNameConverter {
    public static String javaToCpp(String javaName) {
        StringBuilder cppName = new StringBuilder();
        for (int i = 0; i < javaName.length(); i++) {
            char c = javaName.charAt(i);
            if (Character.isUpperCase(c)) {
                cppName.append("_");
            }
            cppName.append(Character.toLowerCase(c));
        }
        return cppName.toString();
    }

    public static String cppToJava(String cppName) {
        StringBuilder javaName = new StringBuilder();
        boolean uppercase = false;
        for (int i = 0; i < cppName.length(); i++) {
            char c = cppName.charAt(i);
            if (c == '_') {
                uppercase = true;
            } else {
                if (uppercase) {
                    javaName.append(Character.toUpperCase(c));
                    uppercase = false;
                } else {
                    javaName.append(c);
                }
            }
        }
        return javaName.toString();
    }

    public static void main(String[] args) {
        String javaName = "javaIsBest";
        String cppName = javaToCpp(javaName);
        System.out.println(cppName); // Output: java_is_best
        String convertedJavaName = cppToJava(cppName);
        System.out.println(convertedJavaName); // Output: javaIsBest

        String cppName2 = "java_is_best";
        String javaName2 = cppToJava(cppName2);
        System.out.println(javaName2); // Output: javaIsBest
        String convertedCppName = javaToCpp(javaName2);
        System.out.println(convertedCppName); // Output: java_is_best
    }
}

