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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
       TreeNode root = new TreeNode(preorder[0]);
        for(int i=0;i<preorder.length;i++){
            insert(root,preorder[i]);
        }
        return root;
    }
    public void insert(TreeNode root, int value){
        if(root!=null && root.left==null && root.val > value){
            root.left = new TreeNode(value);
            return;
        }
        if(root!=null && root.right==null && root.val < value){
            root.right = new TreeNode(value);
            return;
        }
        if(root!=null && root.val > value) insert(root.left,value);
        else if(root!=null && root.val < value) insert(root.right,value);
    }
}