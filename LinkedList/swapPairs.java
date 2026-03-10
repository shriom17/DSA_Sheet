class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;
        ListNode current = head;
        ListNode first;
        ListNode second;

        while(current != null && current.next != null)
        {
            first = current;
            second = current.next;

            first.next = second.next;
            second.next = first;
            temp.next = second;

            temp = first;
            current = first.next;
        }

        return dummy.next;
    }
}
