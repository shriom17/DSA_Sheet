class Solution {
    public int[] singleNumber(int[] nums) 
    {
        int n=nums.length;
        int ans = 0;
        int l=0;
        int r=0;
        for(int i : nums)
        {
            ans=ans^i;
        }
        int mask=ans&(-ans);
        for(int i : nums)
        {
            if((mask&i)==0) 
            {
                l=l^i;
            }
            else
            {
                r=r^i;
            }
        }
        return new int[] {l,r};
    }
}
