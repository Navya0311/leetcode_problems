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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
        {
          slow=slow.next;
        }
        ListNode crr=slow;
        ListNode next,rev=null;
        while(crr!=null)
        {
            next=crr.next;
            crr.next=rev;
            rev=crr;
            crr=next;
        }
        ListNode a=head;
        ListNode b=rev;
        while(b!=null)
        {
            if(a.val!=b.val)
            {
                return false;
            }
          a=a.next;
          b=b.next;
        }
        return true;
    }
}