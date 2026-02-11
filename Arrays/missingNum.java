class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        int cur=0;
        for(int i=0; i<n; i++)
        {
            sum += nums[i];
        }
        for(int i=1; i<=n; i++)
        {
            cur += i;
        }
        return cur-sum;
    }
}
