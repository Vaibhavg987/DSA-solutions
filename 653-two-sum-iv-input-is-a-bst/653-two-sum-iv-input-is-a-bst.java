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
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<>();
        getInorder(root,inorder);
        int i=0,j=inorder.size()-1;
        while(i<j){
            if(inorder.get(i) + inorder.get(j) > k){
                j--;
            }else if(inorder.get(i) + inorder.get(j) < k){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }
    private void getInorder(TreeNode root,List<Integer> list){
        if(root == null) return;
        getInorder(root.left,list);
        list.add(root.val);
        getInorder(root.right,list);
    }
}