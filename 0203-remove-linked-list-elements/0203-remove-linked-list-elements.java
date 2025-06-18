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



//  if(node==null||node.next==null)
//          return ;
//         else
//         {
//             node.val=node.next.val;
//             node.next=node.next.next;
//         }
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode crr=head;
        while (head != null && head.val == val) {
    head = head.next;
}
        while(crr!=null&&crr.next!=null)
        {
            if(crr.next.val==val)
            {
               
                crr.next=crr.next.next;
            }
            else
            {
                crr=crr.next;
            }
        }
        return head;
    }
}