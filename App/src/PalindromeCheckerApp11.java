import java.util.Scanner;

/**
 * Encapsulates palindrome logic to follow OOPS principles.
 */
class PalindromeService {

    /**
     * Checks if a string is a palindrome.
     * Demonstrates Encapsulation by hiding the logic inside a method.
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Internal data handling (Standard Two-Pointer for efficiency)
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeCheckerApp11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Single Responsibility: This class only handles User Interaction
        System.out.print("Enter string: ");
        String userInput = sc.nextLine();

        // Create an instance of the service class
        PalindromeService service = new PalindromeService();

        // Use the encapsulated method
        boolean result = service.checkPalindrome(userInput);

        if (result) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}