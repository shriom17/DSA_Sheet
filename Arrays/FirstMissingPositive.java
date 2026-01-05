class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        int small=1;
        Arrays.sort(nums);
        
        for(int i=0;i<n; i++)
        {
            if(nums[i]==small)
            {
                small++;
            }
        }
        return small;
    }
}
//Another Approach(Optimal)
class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
       // int small=1;
       // Arrays.sort(nums);
     
       int temp;
       for(int i=0; i<n; i++)
       {
          while(nums[i]>0 && nums[i]<=n && nums[nums[i]-1]!=nums[i])
          {
            temp=nums[nums[i]-1];
            nums[nums[i]-1]=nums[i];
            nums[i]=temp;
          }
       }
        for(int i=0;i<n; i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;
    }
}
