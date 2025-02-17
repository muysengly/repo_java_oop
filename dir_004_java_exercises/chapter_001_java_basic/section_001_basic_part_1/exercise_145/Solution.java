import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Create a linked list with five nodes (1, 2, 3, 4, 5)
        ListNode h = new ListNode(1);
        h.next = new ListNode(2);
        h.next.next = new ListNode(3);
        h.next.next.next = new ListNode(4);
        h.next.next.next.next = new ListNode(5);

        // Copy the original linked list to 'o' for display
        ListNode o = h;
        System.out.println("Original node:");

        // Display the original linked list
        while (o != null) {
            System.out.print(o.val + " ");
            o = o.next;
        }

        System.out.println("\nAfter removing 2nd element from end:");

        // Call the removeNthFromEnd function and print the modified linked list
        ListNode head = removeNthFromEnd(h, 2);

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int size = 0;

        // Calculate the size of the linked list
        while (p != null) {
            size++;
            p = p.next;
        }

        // Check if the element to remove is the first one
        if (n == size) {
            head = head.next;
        } else {
            int index = size - n;
            ListNode t = head;

            // Traverse to the node before the one to remove
            while (index > 1) {
                t = t.next;
                index--;
            }

            // Update the 'next' reference to skip the node to remove
            t.next = t.next.next;
        }

        return head; // Return the modified linked list
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
