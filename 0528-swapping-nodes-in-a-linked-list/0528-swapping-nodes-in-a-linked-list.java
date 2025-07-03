class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode crr = head;
        int len = 0;

        // Step 1: Get the length of the list
        while (crr != null) {
            len++;
            crr = crr.next;
        }

        int a = len - k;

        // Step 2: Get the k-th node from start
        ListNode first = head;
        for (int i = 0; i < k - 1; i++) {
            first = first.next;
        }

        // Step 3: Get the k-th node from end (len - k)
        ListNode second = head;
        for (int i = 0; i < a; i++) {
            second = second.next;
        }

        // Step 4: Swap their values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}
