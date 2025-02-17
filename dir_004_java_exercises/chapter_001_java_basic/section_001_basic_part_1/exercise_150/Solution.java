import java.util.*;

public class Solution {
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public static boolean is_Subtree(TreeNode T1, TreeNode T2) {
        if (T2 == null)
            return true; // If T2 is null, it's always a subtree (base case)
        if (T1 == null)
            return false; // If T1 is null but T2 is not, T2 can't be a subtree

        if (is_Same(T1, T2))
            return true; // Check if the current subtrees are the same
        if (is_Subtree(T1.left, T2) || is_Subtree(T1.right, T2))
            return true; // Check left and right subtrees

        return false; // If none of the above conditions match, T2 is not a subtree of T1
    }

    public static boolean is_Same(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == t2; // If one of the nodes is null, both should be null for them to be the same
        } else if (t1.val != t2.val) {
            return false; // If the values are different, the trees are not the same
        } else {
            // Recursively check the left and right subtrees for sameness
            return is_Same(t1.left, t2.left) && is_Same(t1.right, t2.right);
        }
    }

    public static void main(String[] args) {
        // Create two binary trees
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        n1.left = n2;
        n1.right = n3;

        // Check if n1 is a subtree of t1 and print the result
        System.out.println(is_Subtree(t1, n1));
    }
}

class TreeNode {
    public int val;
    public TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}
