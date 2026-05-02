class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int ans=0;
        int diff=nums[n];
        for(int i=n; i>0; i--)
        {
            int j=i-1;
            diff=nums[i] - nums[j];
            ans = Math.max(diff,ans);
        }
        return ans;
    }
}
