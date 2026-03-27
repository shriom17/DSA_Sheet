class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int sum = nums[0];
       int maxSum = nums[0];
       int total = 0;
       int ans=0;
       for(int i : nums)
       {
            total = total+i;
       }
       for(int i=1; i<nums.length; i++)
       {
            sum = Math.max(nums[i], sum+nums[i]);
            maxSum = Math.max(sum, maxSum);
       }
       sum = nums[0];
       int minSum = nums[0];
       for(int i=1; i<nums.length; i++)
       {
            sum = Math.min(nums[i], sum+nums[i]);
            minSum = Math.min(sum, minSum);
       }
       if(maxSum<0)
       {
            ans = maxSum;
       }
       else
       {
            ans = Math.max(maxSum, total-minSum);
       }
       return ans;
    }
}
