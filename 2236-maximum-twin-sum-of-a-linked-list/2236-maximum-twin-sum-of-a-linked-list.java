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
    public int pairSum(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        int len=0;
        while(b!=null)
        {
           b=b.next;
           len++;
        }
        b=head;
        int index=0;

        while(b!=null&&index<len/2)
        {
            b=b.next;
            index++;
        }
        ListNode rev=null,next,crr=b;
        while(crr!=null)
        {
            next=crr.next;
            crr.next=rev;
            rev=crr;
            crr=next;
        }
        int max=0,sum;
        while(rev!=null)
        {
           sum=a.val+rev.val;
            a=a.next;
            rev=rev.next;
            if(sum>max)
            {
                max=sum;
            }
        }
    return max;
        
    }
}