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
    public ListNode mergeNodes(ListNode head) {
        ListNode a=head;
        ListNode b=head.next;
        while(a!=null&&a.next!=null)
        {
        if(a.val==0)
        {
            while(b.val!=0)
            {
                a.val=a.val+b.val;
                b=b.next;
            }
            if (b != null && b.next != null)
            {
            a.next=b;
            a=b;    
            b=b.next;
            }
            else 
            {
            a.next=null;
            break;
            }
        }
        else
        {
            a=a.next;
        }
        }
    return head;
    }
}