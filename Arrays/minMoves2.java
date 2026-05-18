class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int mid=n/2;
        int diff=0;
        for(int i=0; i<n; i++)
        {
            diff += Math.abs(nums[mid]-nums[i]);
        }
        return diff;
    }
}
