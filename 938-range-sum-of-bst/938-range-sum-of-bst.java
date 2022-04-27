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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int rangeSum = 0;
        
        Stack<TreeNode> st = new Stack<>();
        st.add(root);
        
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            if(node!=null){
            if(node.val >= low && node.val <=high){
                rangeSum+=node.val;
            }
            
            if(node.val > low){
                st.add(node.left);
            }
            if(node.val < high){
                st.add(node.right);
            }
            }
        }
        
        return rangeSum;
    }
}