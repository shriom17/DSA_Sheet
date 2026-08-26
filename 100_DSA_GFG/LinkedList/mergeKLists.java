/* Linked List Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    Node mergeKLists(Node[] arr) {

        PriorityQueue<Node> minPq = new PriorityQueue<>(
            (a, b) -> a.data - b.data
        );

        Node head = null;
        Node tail = null;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                minPq.add(arr[i]);
            }
        }

        
        while (!minPq.isEmpty()) {

            
            Node current = minPq.poll();

           ে
            if (head == null) {
                head = current;
                tail = current;
            }
            else {
                ি
                tail.next = current;
                tail = current;
            }

            if (current.next != null) {
                minPq.add(current.next);
            }
        }

        return head;
    }
}
