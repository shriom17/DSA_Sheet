import java.util.*;

class RecentCounter {

    Queue<Integer> queue;   // global queue

    public RecentCounter() {
        queue = new LinkedList<>();  // initialize
    }
    
    public int ping(int t) {
        queue.add(t);  // new request add

        int time = t - 3000;

        // remove old requests
        while (!queue.isEmpty() && queue.peek() < time) {
            queue.poll();
        }

        return queue.size();  // count
    }
}
