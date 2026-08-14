/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node ptr=head;
        Node next=null;
        Node prev=null;
        while(ptr!=null)
        {
            next=ptr.next;
            ptr.next=prev;
            prev=ptr;
            ptr=next;
        }
        
        return prev;
        
    }
}
