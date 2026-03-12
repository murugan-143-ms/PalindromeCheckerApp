import java.util.*;

// 1. Define the Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// 2. Implementation: Stack-Based Strategy
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) stack.push(c);

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());

        return cleaned.equals(reversed.toString());
    }
}

// 3. Implementation: Two-Pointer Strategy
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left++) != cleaned.charAt(right--)) return false;
        }
        return true;
    }
}

// 4. Context Class
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String input) {
        return strategy.check(input);
    }
}

// 5. Main Application
public class PalindromeCheckerApp12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeContext context = new PalindromeContext();

        System.out.print("Enter string: ");
        String userInput = sc.nextLine();

        System.out.println("Choose Strategy: 1. Stack 2. Two-Pointer");
        int choice = sc.nextInt();

        // Polymorphism: Injecting strategy at runtime
        if (choice == 1) {
            context.setStrategy(new StackStrategy());
        } else {
            context.setStrategy(new TwoPointerStrategy());
        }

        if (context.executeStrategy(userInput)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}
