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
    Integer prev = null;
    int max = 0;
    int count = 1;
    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        traverse(root,list);
        
        int[] res = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
    public void traverse(TreeNode node,List<Integer> list){
        if(node == null) return;
        
        traverse(node.left,list);
        
        if(prev != null){
            if(prev == node.val){
                count++;
            }else{
                count = 1;
            }
        }
        if(count>max){
            max = count;
            list.clear();
            list.add(node.val);
        }
        else if(count==max) list.add(node.val);
        
        prev = node.val;
        
        traverse(node.right,list);
    }
}