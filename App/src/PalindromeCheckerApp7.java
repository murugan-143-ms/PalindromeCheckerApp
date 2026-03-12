import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Deque (Double-Ended Queue) allows access from both ends
        Deque<Character> deque = new LinkedList<>();

        // Add all characters to the Deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare from both ends simultaneously
        while (deque.size() > 1) {
            // Remove from front and rear
            char first = Character.toLowerCase(deque.removeFirst());
            char last = Character.toLowerCase(deque.removeLast());

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}
