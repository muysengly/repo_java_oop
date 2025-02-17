class Node {
    int key;
    Node left, right;

    public Node(int item) {
        // Constructor to create a new Node with the given item
        key = item;
        left = right = null;
    }
}

public class BinaryTree {
    // Root of Binary Tree
    Node root;

    BinaryTree() {
        // Constructor to create an empty binary tree
        root = null;
    }

    void print_Postorder(Node node) {
        if (node == null)
            return;

        // Recursively print the left subtree in postorder
        print_Postorder(node.left);

        // Recursively print the right subtree in postorder
        print_Postorder(node.right);

        // Print the key of the current node
        System.out.print(node.key + " ");
    }

    void print_Postorder() {
        // Wrapper method to start printing the tree in postorder
        print_Postorder(root);
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create a binary tree with nodes and keys
        tree.root = new Node(55);
        tree.root.left = new Node(21);
        tree.root.right = new Node(80);
        tree.root.left.left = new Node(9);
        tree.root.left.right = new Node(29);
        tree.root.right.left = new Node(76);
        tree.root.right.right = new Node(91);

        // Display a message and initiate the postorder traversal
        System.out.println("\nPostorder traversal of binary tree is: ");
        tree.print_Postorder();
    }
}
