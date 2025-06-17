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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode crr=head;
        int length=0;
        if(head==null)
        {
            return head;
        }
        while(crr!=null)
        {   
           
            crr=crr.next;
             length++;

        }
        k=k%length;
        int r=length-k;
        ListNode a=head;
        ListNode b=head;
        while(b!=null&&b.next!=null)
        {
            b=b.next;
        }
        int index=1;
        while(a!=null&&index<r)
        {
            
            a=a.next;
           
            index++;
        }
        b.next=head;
        head=a.next;
        a.next=null;
        
        return head;
    }
}