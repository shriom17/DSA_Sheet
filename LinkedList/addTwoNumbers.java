class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode first = l1;
        ListNode second = l2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        int carry = 0;

        while(first != null || second != null || carry != 0)
        {
            int val1 = (first != null) ? first.val : 0;
            int val2 = (second != null) ? second.val : 0;

            int sum = carry + val1 + val2;

            carry = sum / 10;

            temp.next = new ListNode(sum % 10);
            temp = temp.next;

            if(first != null) first = first.next;
            if(second != null) second = second.next;
        }

        return dummy.next;
    }
}
