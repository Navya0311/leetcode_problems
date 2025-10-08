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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        ListNode crr=head;
        while(crr!=null)
        {
            len++;
            crr=crr.next;
        }
        crr=head;
        if(n==len)
        {
            return head.next;
        }
        n=len-n;
        int i=1;
        while(crr!=null&&crr.next!=null&&i<n)
        {
            i++;
            crr=crr.next;
        }
        if(crr.next!=null)
        crr.next=crr.next.next;
        return head;
    }
}