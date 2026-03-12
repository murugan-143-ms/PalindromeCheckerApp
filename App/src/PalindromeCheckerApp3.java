import java.util.Scanner;

public class PalindromeCheckerApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String original = sc.nextLine();
        String reversed = "";

        // Loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        System.out.println("Reversed: " + reversed);

        // Content comparison using equals()
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }
}