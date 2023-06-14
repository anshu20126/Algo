package hundreddayscodeforexperince.code;

import java.util.Scanner;

public class DigitAddition {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Calculate the sum of the digits
        int sum = 0;
        while (number != 0) {
            // Get the last digit of the number and add the digit to the sum
            sum+= number % 10;
            // Remove the last digit from the number
            number /= 10;
        }
        
        // Print the sum of the digits
        System.out.println("Sum of the digits: " + sum);
    }
}
