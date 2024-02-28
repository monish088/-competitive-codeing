/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    int maxHeight = -1;
    public int findBottomLeftValue(TreeNode root) {
        findLeftVal(root,0);
        return ans;
    }
    void findLeftVal(TreeNode root, int currentLevel){
        if(root == null)
            return;
        if(currentLevel > maxHeight){
            maxHeight = currentLevel;
            ans = root.val;
        }
        findLeftVal(root.left, currentLevel+1);
        findLeftVal(root.right, currentLevel+1);
    }
}