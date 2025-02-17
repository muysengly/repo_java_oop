
// Importing necessary Java utilities
import java.util.*;
import java.util.Arrays;
import java.util.LinkedList;

// ListNode class definition representing each node of the linked list
class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize the ListNode
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

// Main class Solution
public class Solution {
    // Initializing the head of the linked list with a node containing value 10
    public static ListNode head = new ListNode(10);

    // Main method
    public static void main(String[] args) {
        // Creating a linked list with nodes containing values 20, 30, 40, 50
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);

        ListNode p = head; // Creating a reference 'p' to the head node

        System.out.println("Original Linked list:");
        printList(p); // Printing the original linked list
        System.out.println("\nAfter deleting the fourth node, Linked list becomes:");
        deleteNode(head.next.next.next); // Deleting the fourth node in the list
        p = head; // Updating reference 'p' to the head node after deletion
        printList(p); // Printing the updated linked list
    }

    // Method to delete a node from the linked list
    public static void deleteNode(ListNode node) {
        // Check if the node to be deleted is not the last node in the list
        if (node.next != null) {
            int temp = node.val;
            node.val = node.next.val;
            node.next.val = temp;

            node.next = node.next.next; // Skip the next node effectively deleting the current node
        } else {
            // If the node to be deleted is the last node, traverse to the previous node and
            // delete it
            ListNode p = head;
            while (p.next.val != node.val) {
                p = p.next;
            }
            p.next = null; // Set the next of the previous node to null
        }
    }

    // Method to print the linked list
    static void printList(ListNode p) {
        while (p != null) {
            System.out.print(p.val); // Printing the value of the current node
            if (p.next != null) {
                System.out.print("->"); // Adding an arrow for non-last nodes
            }
            p = p.next; // Move to the next node
        }
    }
}
