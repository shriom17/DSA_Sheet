class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n= nums.length;
        int i=0;
        while(i<n)
        {
            int curr=nums[i];
            int c=0;
            while(i<n && curr==nums[i])
            {
                c++;
                i++;
            }
            if(c>n/3)
            {
                ans.add(curr);
            }
        }
        return ans;
    }
}
