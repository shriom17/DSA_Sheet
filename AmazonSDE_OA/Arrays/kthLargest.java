class Solution {
    public static int kthLargest(int arr[], int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-k];
    }
}
//Optimized
import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min heap

        for(int num : nums) {
            pq.add(num);

            if(pq.size() > k) {
                pq.poll(); // remove smallest
            }
        }

        return pq.peek(); // kth largest
    }
}
