import java.util.Scanner;

public class PalindromeCheckerApp9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Initial call to the recursive function
        if (isPalindrome(input.toLowerCase(), 0, input.length() - 1)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }

    /**
     * Recursive function to check if a string is a palindrome.
     * @param str The string to check
     * @param start The starting index
     * @param end The ending index
     * @return true if palindrome, false otherwise
     */
    public static boolean isPalindrome(String str, int start, int end) {
        // Base Condition 1: If there is only one character or no characters left
        if (start >= end) {
            return true;
        }

        // Check if characters at current boundaries match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call: Shrink the problem by moving indices inward
        return isPalindrome(str, start + 1, end - 1);
    }
}
