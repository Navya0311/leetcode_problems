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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         List<List<Integer>> res=new ArrayList();
        Queue<TreeNode>q=new LinkedList();
        if(root==null)
        {
            return res;
        }
        q.add(root);
        int level=0;
        while(!q.isEmpty())
        {
             List<Integer> crr=new ArrayList();
             int length=q.size();
             for(int i=0;i<length;i++)
             {
                TreeNode first=q.poll();
                  if (level % 2 == 0) {
                    crr.add(first.val);        // left to right
                } else {
                    crr.add(0, first.val);     // right to left (insert at front)
                }
               
                if(first.left!=null)
                {
                    q.add(first.left);
                }
                if(first.right!=null)
                {
                    q.add(first.right);
                }

             }
             res.add(crr);
             level++;
        }
        return res;
    }
}