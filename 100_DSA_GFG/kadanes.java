class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int sum = 0;
        int maxSum = arr[0];
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
            maxSum = Math.max(maxSum, sum);
            if(sum<0)
            {
                sum = 0;
            }
        }
        
        return maxSum;
    }
}
