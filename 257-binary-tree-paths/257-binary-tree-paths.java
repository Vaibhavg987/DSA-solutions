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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        paths(root,"",ans);
        return ans;
    }
    public void paths(TreeNode node,String path,List<String> ans){
        if(node == null) return;
        
        path+=String.valueOf(node.val);
        if(node.left == null && node.right == null){
            ans.add(path);
        }
        if(node.left!=null) paths(node.left,path+"->",ans);
        if(node.right!=null) paths(node.right,path+"->",ans);
    }
}