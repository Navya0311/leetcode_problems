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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode crr=head;
        if(head.next==null)
        {
            return head.next;
        }
        while(fast!=null&&fast.next!=null)
        {   
            crr=slow;
            slow=slow.next;
        
            fast=fast.next.next;
        }
          crr.next=slow.next;
          return head;
        
    }
}