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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int skipA=0;
        int skipB=0;
        int diff;
        while(tempA!=null)
        {
            skipA++;
            tempA=tempA.next;
        }
        while(tempB!=null)
        {
            skipB++;
            tempB=tempB.next;
        }
        diff=Math.abs(skipA-skipB);
        tempA = headA;
        tempB = headB;
        if(skipA>skipB)
        {
            while(diff!=0)
            {
                tempA=tempA.next;
                diff--;
            }
        }
        if(skipA<skipB)
        {
            while(diff!=0)
            {
                tempB=tempB.next;
                diff--;
            }
        }
        while(tempA != tempB)
        {
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}
