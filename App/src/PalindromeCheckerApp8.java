import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = Character.toLowerCase(data);
        this.next = null;

public class PalindromeCheckerApp8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();

        if (input.isEmpty()) {
            System.out.println("Result: It is a palindrome.");
            return;
        }

        // 1. Convert string to Singly Linked List
        Node head = new Node(input.charAt(0));
        Node temp = head;
        for (int i = 1; i < input.length(); i++) {
            temp.next = new Node(input.charAt(i));
            temp = temp.next;
        }

        // 2. Find Middle using Fast and Slow Pointer
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse the second half of the list
        Node secondHalf = reverseList(slow);
        Node firstHalf = head;

        // 4. Compare both halves
        boolean isPalindrome = true;
        Node p1 = firstHalf;
        Node p2 = secondHalf;
        while (p2 != null) {
            if (p1.data != p2.data) {
                isPalindrome = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is not a palindrome.");
        }

        sc.close();
    }

    // Helper method for In-Place Reversal
    private static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
