class Solution {
    public int maxProduct(int[] nums) {
         int pro=nums[0];
        int maxPro=nums[0];
        int maxx=nums[0];
        for(int i=1; i<nums.length; i++)
        {
             if (nums[i] < 0) {
                int temp = maxPro;
                maxPro = pro;
                pro = temp;
            }
            pro = Math.min(nums[i], pro*nums[i]);
            maxPro=Math.max(nums[i], maxPro*nums[i]);
            maxx=Math.max(maxx, maxPro);
        }

        return maxx;
    }
}
