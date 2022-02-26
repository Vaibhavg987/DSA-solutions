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
    public int countNodes(TreeNode root) {
        return orderTraversal(root);
    }
    private int orderTraversal(TreeNode root)
     {
         if(root != null)
      {
       return 1 + orderTraversal(root.left)+orderTraversal(root.right);
      }
      return 0;  
}
}