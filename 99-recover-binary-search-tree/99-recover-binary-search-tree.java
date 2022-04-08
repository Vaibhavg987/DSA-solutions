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
    List<Integer> inorder;
    int i=0;
    public void recoverTree(TreeNode root) {
        inorder = new ArrayList<>();
        in(root,inorder);
        Collections.sort(inorder);
        settle(root);
    }
    public void settle(TreeNode root){
        if(root == null) return;
        settle(root.left);
        root.val = inorder.get(i++);
        settle(root.right);
    }
    public void in(TreeNode root,List<Integer> list){
        if(root == null) return;
        in(root.left,list);
        list.add(root.val);
        in(root.right,list);
    }
}