class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i=0;
        double maxSum=0.0;
        double avg=0.0;
        double sum=0.0;
        while(i<k)
        {
            sum=sum+nums[i];
            i++;
        }
        maxSum=sum;
        int left=0;
        int right=k;
        while(right<n)
        {
            sum = sum-nums[left]+nums[right];
            maxSum = Math.max(sum, maxSum);
            left++;
            right++;
        }
        avg = maxSum/k;
        return avg;
    }
}
