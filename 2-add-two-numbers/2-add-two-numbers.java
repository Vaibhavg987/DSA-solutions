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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
       ListNode dummyNode = new ListNode(0);   
        ListNode temp = dummyNode;
        int carry = 0;
        
        while(l1!=null || l2!=null || carry == 1){
           int ans = 0;
            if(l1!=null){
                ans += l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                ans+=l2.val;
                l2 = l2.next;
            }
           ans+=carry;
           carry = ans/10;
            ListNode node = new ListNode(ans%10);
            temp.next = node;
            temp = temp.next;
        }
        
        return dummyNode.next;
    }
}