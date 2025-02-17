
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Creating TreeNode instances
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);

        // Creating a tree structure
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        // Printing the original TreeNode
        System.out.println("Original Treenode:");
        traverseTree(t1);

        // Cloning the TreeNode and printing the clone
        System.out.println("\nClone of the said Treenode:");
        TreeNode result = cloneTree(t1);
        traverseTree(result);
    }

    // Method to clone a given TreeNode
    public static TreeNode cloneTree(TreeNode root) {
        // Checking if the root is null
        if (root == null) {
            return null;
        }

        // Creating a duplicate TreeNode with the same value as the original root
        TreeNode dup = new TreeNode(root.val);

        // Recursively cloning left and right subtrees
        dup.left = cloneTree(root.left);
        dup.right = cloneTree(root.right);

        return dup; // Returning the cloned TreeNode
    }

    // Method to traverse the TreeNode in post-order traversal (Left, Right, Root)
    private static void traverseTree(TreeNode root) {
        // Checking if the root is not null
        if (root != null) {
            // Traversing the left subtree
            traverseTree(root.left);
            // Traversing the right subtree
            traverseTree(root.right);
            // Printing the value of the current TreeNode
            System.out.println(root.val);
        }
    }
}

// Definition of TreeNode class
class TreeNode {
    public int val;
    public TreeNode left, right;

    // Constructor to initialize TreeNode with a value
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
