class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>(); // stores indexes

        for (int i = 0; i < nums.length; i++) {

            // 1. Remove indexes outside current window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.removeFirst();
            }

            // 2. Remove smaller elements from back
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.removeLast();
            }

            // 3. Add current index
            dq.addLast(i);

            // 4. Add max when window is ready
            if (i >= k - 1) {
                ans.add(nums[dq.peekFirst()]);
            }
        }

        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}
