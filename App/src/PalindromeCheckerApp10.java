import java.util.Scanner;

public class PalindromeCheckerApp10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string (can include spaces and punctuation): ");
        String input = sc.nextLine();

        // 1. Preprocessing / Normalization
        // Lowercase the string and use Regex to remove all non-alphanumeric characters
        // [^a-zA-Z0-9] means "anything that is NOT a letter or a number"
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        System.out.println("Normalized String: " + normalized);

        // 2. Apply Palindrome Logic (Two-Pointer approach)
        boolean isPalindrome = true;
        int left = 0;
        int right = normalized.length() - 1;

        if (normalized.isEmpty()) {
            isPalindrome = true;
        } else {
            while (left < right) {
                if (normalized.charAt(left) != normalized.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
        }

        // 3. Display Result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome (ignoring spaces/case).");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}