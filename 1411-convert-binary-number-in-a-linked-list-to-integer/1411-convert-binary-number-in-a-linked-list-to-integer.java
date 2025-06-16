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
    public int getDecimalValue(ListNode head) {
      ListNode crr;
      crr=head;
      int rev=0;
      while(crr!=null)
      {
         rev=rev*2+crr.val;
         crr=crr.next;
      }
        return rev;
    }
}