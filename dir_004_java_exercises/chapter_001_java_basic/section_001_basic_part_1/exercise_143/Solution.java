import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Create two sorted linked lists
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(7);
        list1.next.next.next = new ListNode(9);
        list1.next.next.next.next = new ListNode(13);
        ListNode list2 = new ListNode(2);
        list2.next = new ListNode(40);

        // Merge the two sorted lists and get the result
        ListNode head = mergeTwoLists(list1, list2);
        System.out.print("Merge Two Sorted Lists:\n");

        // Print the merged list
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a new linked list for the merged result
        ListNode head = new ListNode(0);
        ListNode mlist = head;

        // Merge the two lists while maintaining the order
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mlist.next = new ListNode(list1.val);
                mlist = mlist.next;
                list1 = list1.next;
            } else {
                mlist.next = new ListNode(list2.val);
                mlist = mlist.next;
                list2 = list2.next;
            }
        }

        // Append any remaining elements from list1
        while (list1 != null) {
            mlist.next = new ListNode(list1.val);
            mlist = mlist.next;
            list1 = list1.next;
        }

        // Append any remaining elements from list2
        while (list2 != null) {
            mlist.next = new ListNode(list2.val);
            mlist = mlist.next;
            list2 = list2.next;
        }

        // Skip the dummy head node and return the merged list
        head = head.next;
        return head;
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
