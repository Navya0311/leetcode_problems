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
     public ListNode reverse(ListNode start,ListNode end)
     {
        ListNode crr=start,rev_head=null,next;
        while(crr!=end)
        {
            next=crr.next;
            crr.next=rev_head;
            rev_head=crr;
            crr=next;
        }
        return rev_head;
     }
    public ListNode reverseKGroup(ListNode head, int k) {
    ListNode b=head;
    int index=0;
    while(index<k&&b!=null)
           {
            index++;
            b=b.next;
            }
            if(index<k)
            {
                return head;
            }
            ListNode newhead = reverse(head, b);
             head.next = reverseKGroup(b, k);
                    
     
    return newhead;
        
    }
}