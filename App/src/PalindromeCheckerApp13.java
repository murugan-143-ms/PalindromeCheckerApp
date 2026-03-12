import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string for performance testing: ");
        String input = sc.nextLine();

        System.out.println("\n--- Benchmarking Results ---");

        // 1. Measure String Reversal Approach (UC3)
        long startUC3 = System.nanoTime();
        checkByReversal(input);
        long endUC3 = System.nanoTime();
        System.out.println("String Reversal Time: " + (endUC3 - startUC3) + " ns");

        // 2. Measure Two-Pointer Approach (UC4)
        long startUC4 = System.nanoTime();
        checkByTwoPointer(input);
        long endUC4 = System.nanoTime();
        System.out.println("Two-Pointer Time   : " + (endUC4 - startUC4) + " ns");

        // 3. Measure Stack-Based Approach (UC5)
        long startUC5 = System.nanoTime();
        checkByStack(input);
        long endUC5 = System.nanoTime();
        System.out.println("Stack-Based Time    : " + (endUC5 - startUC5) + " ns");

        sc.close();
    }

    // Logic from UC3
    private static boolean checkByReversal(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }

    // Logic from UC4
    private static boolean checkByTwoPointer(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(str.charAt(left++)) != Character.toLowerCase(str.charAt(right--))) {
                return false;
            }
        }
        return true;
    }

    // Logic from UC5
    private static boolean checkByStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) stack.push(c);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());
        return str.equalsIgnoreCase(sb.toString());
    }
}