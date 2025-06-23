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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer> >result = new ArrayList<>();
       level(root,0,result);
       return result;
        }
        public static  void level(TreeNode root,int l, List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        if(result.size()==l)
        {
              List<Integer> res = new ArrayList<>();
              res.add(root.val);
              result.add(res);
        }
        else
        {
            result.get(l).add(root.val);
        }
        level(root.left,l+1,result);

        level(root.right,l+1,result);
    }
}