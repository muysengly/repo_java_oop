class LinkedList {
    // Static variable to store the head of the linked list
    static Node head;

    static class Node {
        int data;         // Data stored in the node
        Node next_node;   // Reference to the next node

        Node(int d) {
            data = d;
            next_node = null;
        }
    }

    // Function to reverse the linked list
    Node reverse(Node node) {
        Node prev_node = null;
        Node current_node = node;
        Node next_node = null;
        while (current_node != null) {
            next_node = current_node.next_node;
            current_node.next_node = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        node = prev_node;
        return node;
    }

    // Function to print the elements of the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next_node;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Create a linked list with some initial values
        list.head = new Node(20);
        list.head.next_node = new Node(40);
        list.head.next_node.next_node = new Node(60);
        list.head.next_node.next_node.next_node = new Node(80);
        
        // Print the original linked list
        System.out.println("Original Linked list:");
        list.printList(head);
        
        // Reverse the linked list
        head = list.reverse(head);
        
        System.out.println("");
        // Print the reversed linked list
        System.out.println("Reversed Linked list:");
        list.printList(head);
    }
}
