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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode n1 = null;
        ListNode n2 = head;
        
        while(n2!=null && n2.next!=null){
            int val = n2.val;
            if(n2.next.val == val){
                while(n2!=null && val == n2.val){
                    n2 = n2.next;
                }
                if(n1 == null && n2!=null) head = n2;
                else if(n1 == null && n2 == null) return null;
                else n1.next = n2;
            }
            else{
                n1 = n2;
                n2 = n2.next;
            }
        }
        return head;
    }
}