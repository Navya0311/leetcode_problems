/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode A, ListNode B) {
        ListNode a=A;
        ListNode b=B;

      while(a!=b)
      {
        if(a!=null)
        {
          a=a.next;
        }
        else
        {
            a=B;
        }
        if(b!=null)
        {
            b=b.next;
        }
        else
        {
            b=A;
        }
      }
       return a; 
    }
}