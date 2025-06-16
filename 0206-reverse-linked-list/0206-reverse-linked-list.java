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
    public ListNode reverseList(ListNode head) {
        ListNode crr;
        crr=head;
        ListNode rev_node;
        rev_node=null;
        ListNode next;
        while(crr!=null)
        {
            next=crr.next;
            crr.next=rev_node;
            rev_node=crr;
            crr=next;
        }
        return rev_node;
    }
}