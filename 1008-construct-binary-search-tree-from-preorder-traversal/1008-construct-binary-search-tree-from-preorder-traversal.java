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
        return build(preorder,new int[]{0},Integer.MAX_VALUE);
    }
    public TreeNode build(int[] a,int[] i,int bound){
        if(i[0]==a.length || a[i[0]] > bound) return null;
        TreeNode root = new TreeNode(a[i[0]++]);
        root.left = build(a,i,root.val);  
        root.right = build(a,i,bound);
        return root;
    }
}