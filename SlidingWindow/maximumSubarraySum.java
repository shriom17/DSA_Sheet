class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();

        int left = 0;
        long sum = 0;
        long maxSum = 0;

        for (int right = 0; right < n; right++) {

            // duplicate  remove 
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // add current element
            set.add(nums[right]);
            sum += nums[right];

            // window size > k হলে shrink
            if (right - left + 1 > k) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // valid window (size == k)
            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}
