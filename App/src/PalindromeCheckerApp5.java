import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        // Initialize a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push all characters of the string onto the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        String reversed = "";

        // Pop characters from the stack to form the reversed string
        // Stack follows LIFO (Last In First Out), naturally reversing the input
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        System.out.println("Reversed using Stack: " + reversed);

        // Compare original and reversed content
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}
