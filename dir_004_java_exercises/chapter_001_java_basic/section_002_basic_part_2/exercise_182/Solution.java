
// Importing necessary Java utilities
import java.util.*;

// Main class Solution
public class Solution {
    // Main method
    public static void main(String[] args) {
        // Creating TreeNode 'a'
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);

        // Creating TreeNode 'b'
        TreeNode b = new TreeNode(1);
        b.left = new TreeNode(2);
        b.right = new TreeNode(3);
        b.left.right = new TreeNode(4);

        // Creating TreeNode 'c'
        TreeNode c = new TreeNode(1);
        c.left = new TreeNode(2);
        c.right = new TreeNode(3);
        c.left.right = new TreeNode(4);

        // Comparing TreeNode 'a' and TreeNode 'b'
        System.out.println("\nComparing TreeNode a and TreeNode b:");
        System.out.println(is_Identical_tree_node(a, b));

        // Comparing TreeNode 'b' and TreeNode 'c'
        System.out.println("\nComparing TreeNode b and TreeNode c:");
        System.out.println(is_Identical_tree_node(b, c));
    }

    // Method to check if two TreeNode objects are identical
    public static boolean is_Identical_tree_node(TreeNode a, TreeNode b) {
        // Write your code here
        if (a == null && b == null)
            return true;
        if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val)
            return false;
        return is_Identical_tree_node(a.left, b.left) &&
                is_Identical_tree_node(a.right, b.right);
    }
}

// Definition of TreeNode class
class TreeNode {
    public int val;
    public TreeNode left, right;

    // Constructor to initialize TreeNode object with a value
    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
