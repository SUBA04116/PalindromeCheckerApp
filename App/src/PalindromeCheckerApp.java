/**
 *
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 *
 * Use Case 13: Performance Comparison
 *
 * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 *
 * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 *
 * This use case focuses purely on performance
 * measurement and algorithm comparison.
 *
 * The goal is to introduce benchmarking concepts.
 *
 * @author Subashree
 * @version 13.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     *
     * @param args Command-Line arguments
     */
    public static void main(String[] args) {

        // Define input
        String input = "Level";

        // Convert to lowercase
        input = input.toLowerCase();

        // Use a strategy implementation
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time
        long startTime = System.nanoTime();

        // Execute palindrome check
        boolean isPalindrome = strategy.check(input);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate execution duration
        long executionTime = endTime - startTime;

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}

/**
 * INTERFACE - PalindromeStrategy
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * CLASS - StackStrategy
 *
 * Stack-based palindrome validation.
 */
class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare while popping
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}