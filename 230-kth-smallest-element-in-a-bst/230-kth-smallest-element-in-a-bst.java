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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        allElements(root,list);
        Collections.sort(list);
        int ans = 0;
        for(int i=0;i<k;i++){
            ans = list.get(i);
        }
        return ans;
    }
    public void allElements(TreeNode root,List<Integer> list){
        if(root == null) return;
        
        allElements(root.left,list);
        list.add(root.val);
        allElements(root.right,list);
    }
}