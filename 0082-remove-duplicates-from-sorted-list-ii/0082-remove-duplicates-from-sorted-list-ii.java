class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {
            // Check for duplicates
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with same value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                // Skip the last duplicate
                prev.next = head.next;
            } else {
                // No duplicate, move prev
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}
