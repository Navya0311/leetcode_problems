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
    Integer prev = null;

    public boolean isValidBST(TreeNode root) {
        return inOrder(root);
    }

    public boolean inOrder(TreeNode node) {
        if (node == null) return true;

        // Left subtree must be valid
        if (!inOrder(node.left)) return false;

        // Check current node with previous value
        if (prev != null && node.val <= prev) {
            return false;
        }
        prev = node.val;

        // Right subtree must be valid
        return inOrder(node.right);
    }
}
