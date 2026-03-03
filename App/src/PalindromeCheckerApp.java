/**MAIN CLASS UsaGamesPalindrome CheckerAра
Use Case S: Stack Based Palindrace Checker
Description:
This class validates a palindrome using a Stack
        data structure which follows the LIFO principle.
At this stuge, the application:
Pushes characters into a stack
Pops them in reverse ander
Compares with onlyinat sequence
Displays the result
This maps stack benaviar to neversal logie.
 author Subashree
Mercaton 5.0
public class UseCase PalindromeCheckerApp (
        Application entry point for CS
poram args Command-line argoments*/

import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Declare and initialize the input string.
        String input = "noon";

        // Create a Stack to store characters.
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack.
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially.
        boolean isPalindrome = true;

        // Iterate again through original string.
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}

