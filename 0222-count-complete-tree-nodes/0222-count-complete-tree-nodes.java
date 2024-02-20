// public class Solution {
//     public int countNodes(TreeNode root) {
//         if (root == null) {
//             return 0;
//         }
        
//         int leftHeight = leftHeight(root);
//         int rightHeight = rightHeight(root);
        
//         if (leftHeight == rightHeight) {
//             // If the left and right subtrees have the same height,
//             // the tree is a full binary tree, and the number of nodes
//             // can be calculated using the formula 2^h - 1, where h is the height.
//             return (1 << leftHeight) - 1;
//         } else {
//             // If the heights are different, recursively count the nodes in
//             // the left and right subtrees and add 1 for the root node.
//             return 1 + countNodes(root.left) + countNodes(root.right);
//         }
//     }
    
//     private int leftHeight(TreeNode node) {
//         int height = 0;
//         while (node != null) {
//             height++;
//             node = node.left;
//         }
//         return height;
//     }
    
//     private int rightHeight(TreeNode node) {
//         int height = 0;
//         while (node != null) {
//             height++;
//             node = node.right;
//         }
//         return height;
//     }
// }
public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = leftHeight(root);
        int rightHeight = rightHeight(root);
        
        if (leftHeight == rightHeight) {
            // If the left and right subtrees have the same height,
            // the tree is a full binary tree, and the number of nodes
            // can be calculated using the formula 2^h - 1, where h is the height.
            return (1 << leftHeight) - 1;
        } else {
            // If the heights are different, recursively count the nodes in
            // the left and right subtrees and add 1 for the root node.
            return 1 + countNodes(root.left) + countNodes(root.right);
        }
    }
    
    private int leftHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.left;
        }
        return height;
    }
    
    private int rightHeight(TreeNode node) {
        int height = 0;
        while (node != null) {
            height++;
            node = node.right;
        }
        return height;
    }
}

