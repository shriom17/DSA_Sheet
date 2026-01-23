class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int start = 0;
        int sum;
        for(int i=0; i<n; i++)
        {
            sum=0;
            start = i;
            while(start<n)
            {
                sum = sum + nums[start];
                if(sum==k)
                {
                    count++;
                }
                start++;
            }
        }
        return count;
    }
}
