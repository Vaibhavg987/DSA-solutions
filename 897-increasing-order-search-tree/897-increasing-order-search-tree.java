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
    TreeNode head = null,parent=null;
    public TreeNode increasingBST(TreeNode root) {
        
        inorder(root);
        return head;
    }
 
    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        if(head == null) head = root;
        if(parent == null) parent = root;
        else{
            parent.right = root;
            parent = root;
            parent.left = null;
        }
        inorder(root.right);
    }
}