import java.util.Scanner;

public class PalindromeCheckerApp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;
        int start = 0;
        int end = charArray.length - 1;

        // Two-pointer approach
        while (start < end) {
            // Compare characters at start and end indices
            if (Character.toLowerCase(charArray[start]) != Character.toLowerCase(charArray[end])) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}