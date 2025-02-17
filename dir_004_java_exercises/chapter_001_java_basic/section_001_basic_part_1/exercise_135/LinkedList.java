class LinkedList {
    Node head; // Reference to the head node of the linked list

    /* Linked list Node */
    class Node {
        int data; // Data stored in the node
        Node next; // Reference to the next node

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to remove duplicate elements from the linked list
    void remove_Duplicates() {
        Node current = head; // Initialize the current node to the head
        Node next_next; // Reference to the next of the next node

        if (head == null)
            return; // If the linked list is empty, return

        while (current.next != null) {
            if (current.data == current.next.data) {
                next_next = current.next.next;
                current.next = null; // Remove the duplicate node
                current.next = next_next; // Update the next reference
            } else
                current = current.next; // Move to the next node
        }
    }

    // Method to insert a new node at the front of the linked list
    public void push(int new_data) {
        Node new_node = new Node(new_data); // Create a new node
        new_node.next = head; // Set the next of the new node to the current head
        head = new_node; // Update the head to the new node
    }

    // Method to print the linked list
    void printList() {
        Node temp = head; // Initialize a temporary node with the head
        while (temp != null) {
            System.out.print(temp.data); // Print the data of the current node
            if (temp.next != null) {
                System.out.print("->"); // Print an arrow to indicate the next node
            }
            temp = temp.next; // Move to the next node
        }
        System.out.println(); // Print a new line to complete the list
    }

    // Driver program to test the above functions
    public static void main(String args[]) {
        LinkedList l_list = new LinkedList();

        // Insert data into the linked list
        l_list.push(17);
        l_list.push(17);
        l_list.push(16);
        l_list.push(15);
        l_list.push(15);
        l_list.push(14);
        l_list.push(13);
        l_list.push(12);
        l_list.push(12);

        System.out.println("Original List with duplicate elements:");
        l_list.printList();

        l_list.remove_Duplicates(); // Remove duplicates

        System.out.println("After removing duplicates from the said list:");
        l_list.printList();
    }
}
