/**
MAIN CLASS UseCase Palindrome CheckerApp
Use Case 3: Reverse String Based Palindrome Check
Description:
This class checks whether a string is a palindrome
        by reversing the string and comparing it with
        the original value.
At this stage, the application:
Iterates the string in reverse order
* Builds a reversed version
Compares original and reversed strings
* Displays the validation result
This introduces transformation-based validation.
 * @author Subashree
 * version 3.6
public class UseCase3PalindromeCheckerApp {
}
/**
 * Application entry point for UC3.
 @param args Command-Line arguments.
 public static void main(String[] args)import java .util.Scanner;
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC3.
     */
    public static void main(String[] args) {
        String input = "madam"; // Example input string
        String reversedInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedInput += input.charAt(i);
        }

        if (input.equals(reversedInput)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
