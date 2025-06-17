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
    ListNode a;
    a=head;
    int length=0;
    while(a!=null){
        a=a.next;
        length++;
     }
     a=head;
     if(length==n)
      {
       return a.next; 
      }
      n=length-n;
      
      int index=1;
      while(a!=null&&a.next!=null&&index<n)
      {
        a=a.next;
        index++;
      }
      if(a.next!=null)
      a.next=a.next.next;
    return head;
    }
}