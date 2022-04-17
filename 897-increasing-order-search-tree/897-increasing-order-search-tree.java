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
    TreeNode prev = null;
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        return buildTree(list);
    }
    public TreeNode buildTree(List<Integer> list){
        if(list.size()==0) return null;
        TreeNode root = new TreeNode(list.remove(0));
        root.right = buildTree(list);
        return root;
    }
    public void inorder(TreeNode root,List<Integer> list){
        if(root == null) return;

        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}