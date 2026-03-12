public class PalindromeCheckerApp2
{

        public static void main(String[] args) {
            // 1. Hardcoded String Literal
            String original = "madam";
            String reverse = "";

            // 2. Logic to reverse the string
            int length = original.length();
            for (int i = length - 1; i >= 0; i--) {
                reverse = reverse + original.charAt(i);
            }

            // 3. Conditional Statement (if-else) to check palindrome
            if (original.equals(reverse)) {
                System.out.println("The string \"" + original + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + original + "\" is not a palindrome.");
            }

            // 4. Program exits automatically after main ends
        }

}
