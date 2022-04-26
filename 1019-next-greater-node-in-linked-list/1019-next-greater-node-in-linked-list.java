/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> nodeVal = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            nodeVal.add(temp.val);
            temp = temp.next;
        }
        
        int[] ans = new int[nodeVal.size()];
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<nodeVal.size();i++){
            while(!st.isEmpty() && nodeVal.get(st.peek()) < nodeVal.get(i)){
                ans[st.pop()] = nodeVal.get(i);
            }
            st.push(i);
        }
        return ans;
    }
}