import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeCheckerApp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Stack follows LIFO (Last In First Out)
        Stack<Character> stack = new Stack<>();
        // Queue follows FIFO (First In First Out)
        Queue<Character> queue = new LinkedList<>();

        // Add each character to both data structures
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stack.push(ch);   // Enters stack
            queue.add(ch);    // Enters queue
        }

        boolean isPalindrome = true;

        // Compare elements as they are removed
        // Queue.poll() gives the first character (FIFO)
        // Stack.pop() gives the last character (LIFO)
        while (!stack.isEmpty()) {
            char fromStack = Character.toLowerCase(stack.pop());
            char fromQueue = Character.toLowerCase(queue.poll());

            if (fromStack != fromQueue) {
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