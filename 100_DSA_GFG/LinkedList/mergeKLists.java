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

        // সব linked list-এর head PriorityQueue-তে রাখি
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                minPq.add(arr[i]);
            }
        }

        // যতক্ষণ queue-তে node আছে
        while (!minPq.isEmpty()) {

            // সবচেয়ে ছোট node বের করি
            Node current = minPq.poll();

            // প্রথম node হলে
            if (head == null) {
                head = current;
                tail = current;
            }
            else {
                // merged list-এর শেষে current যোগ করি
                tail.next = current;
                tail = current;
            }

            // current যে list থেকে এসেছে,
            // সেই list-এর পরের node queue-তে ঢোকাই
            if (current.next != null) {
                minPq.add(current.next);
            }
        }

        return head;
    }
}
