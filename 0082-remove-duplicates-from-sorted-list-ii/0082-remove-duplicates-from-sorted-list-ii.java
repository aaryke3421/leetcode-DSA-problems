class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode current = head;

        while (current != null) {

            // detect duplicates
            if (current.next != null && current.val == current.next.val) {

                // skip all nodes with this value
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }

                // remove entire duplicate block
                prev.next = current.next;

            } else {
                // move prev only if no duplicate
                prev = prev.next;
            }

            current = current.next;
        }

        return dummy.next;
    }
}