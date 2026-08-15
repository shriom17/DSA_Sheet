/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
     Node sortedMerge(Node head1, Node head2) {

         Node dummy = new Node(0);
         Node tail = dummy;

         Node first = head1;
         Node second = head2;

         while (first != null && second != null) {

             if (first.data <= second.data) {
                 tail.next = first;
                 first = first.next;
             } 
             else {
                 tail.next = second;
                 second = second.next;
             }

             tail = tail.next;
         }

         // Attach remaining nodes
         if (first != null) {
             tail.next = first;
         } 
         else {
             tail.next = second;
         }

         return dummy.next;
     }
 }
