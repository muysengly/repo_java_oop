public class Solution {
    public static void main(String[] args) {
        // Define an array of sorted integers
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        // Convert the sorted array to a balanced binary search tree (BST)
        TreeNode root = sortedArrayToBST(arr);
        
        // Traverse the BST and print the values
        traverseTree(root);
    }

    public static TreeNode sortedArrayToBST(int[] arr) {
        if (arr.length == 0) return null;
        
        // Call the recursive function for creating the BST
        return creation(arr, 0, arr.length - 1);
    }

    private static TreeNode creation(int[] arr, int start, int end) {
        TreeNode node = new TreeNode(0);
        
        if (start == end - 1) {
            // If the range contains two elements, create the nodes accordingly
            node = new TreeNode(arr[start]);
            node.right = new TreeNode(arr[end]);
        } else if (start == end) {
            // If the range contains a single element, create a node
            return new TreeNode(arr[start]);
        } else {
            // Calculate the middle index of the range
            int mid = (start + end) / 2;
            
            // Set the value of the current node to the middle element
            node.val = arr[mid];
            
            // Recursively create left and right subtrees
            node.left = creation(arr, start, mid - 1);
            node.right = creation(arr, mid + 1, end);
        }
        return node;
    }

    private static void traverseTree(TreeNode root) {
        // Post-order traversal of the BST (left, right, root)
        if (root != null) {
            traverseTree(root.left);
            traverseTree(root.right);
            System.out.println(root.val);
        }
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
