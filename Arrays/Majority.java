class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
       // int count=1;
        int max = 1;
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
           max = nums[n/2];
        }
       return max;
    }
}
