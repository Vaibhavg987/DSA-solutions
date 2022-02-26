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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> parent_track = new HashMap<>();
        markParent(root,parent_track,target);
        Map<TreeNode,Boolean> visited = new HashMap<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(target);
        visited.put(target,true);
        int curLvl = 0;
        while(!q.isEmpty()){
            int size = q.size();
            if(curLvl == k) break;
            curLvl++;
            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                if(current.left!=null && visited.get(current.left) == null){
                    q.offer(current.left);
                    visited.put(current.left,true);
                }
                if(current.right!=null && visited.get(current.right) == null){
                    q.offer(current.right);
                    visited.put(current.right,true);
                }
                if(parent_track.get(current)!=null && visited.get(parent_track.get(current))==null){
                    q.offer(parent_track.get(current));
                    visited.put(parent_track.get(current),true);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode node = q.poll();
            ans.add(node.val);
        }
        return ans;
    }
    public void markParent(TreeNode root,Map<TreeNode,TreeNode> parent_track,TreeNode target){
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            if(current.left!=null){
                parent_track.put(current.left,current);
                q.offer(current.left);
            }
            if(current.right!=null){
                parent_track.put(current.right,current);
                q.offer(current.right);
            }
        }
    }
}