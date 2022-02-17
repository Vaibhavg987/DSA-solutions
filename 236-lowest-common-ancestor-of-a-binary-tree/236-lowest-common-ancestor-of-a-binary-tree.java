/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<TreeNode> list1;
    List<TreeNode> list2;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        
        path(1, root, p, new ArrayList<>());
        path(2, root, q, new ArrayList<>());
        
        TreeNode ans = root;
        for(int i=0;i<Math.min(list1.size(),list2.size());i++){
            if(list1.get(i) == list2.get(i)){
                ans = list1.get(i);
            }
            else
                break;
        }
        return ans;
    }
     public void path(int listType, TreeNode node, TreeNode target, List<TreeNode> list){
         if(node == null) 
             return;
         list.add(node);
         if(node == target){
             if(listType == 1){
                  list1 = new ArrayList<>(list);
             }
             else{
                  list2 = new ArrayList<>(list);
             }
         }
         path(listType, node.left, target, list);
        path(listType, node.right, target, list);
        list.remove(list.size()-1);
     }
}