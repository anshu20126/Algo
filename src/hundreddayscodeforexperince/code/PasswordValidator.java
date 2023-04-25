package hundreddayscodeforexperince.code;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        String password = "myPassw@12";
        try {
            validatePassword(password);
            System.out.println("Password is valid.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validatePassword(String password) throws Exception {
        if (password == null || password.isEmpty()) {
            throw new Exception("Password cannot be empty.");
        }
        if (password.length() != 10) {
            throw new Exception("Password must be 10 characters long.");
        }
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*[A-Z]+[a-zA-Z0-9]*[a-z]+[a-zA-Z0-9]*[@#$%^&+=]+[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.matches()) {
            throw new Exception("Password must contain at least one uppercase letter, one lowercase letter, and one special character (@#$%^&+=).");
        }
    }

}
