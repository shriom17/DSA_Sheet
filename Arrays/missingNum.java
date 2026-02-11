class Solution {
    public int missingNumber(int[] nums) {
        //Gauss Method
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
//XOR Method
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x1=0;
        int x2=0;
        for(int i=0; i<n; i++)
        {
            x1 = x1 ^ nums[i];
        }
        for(int i=1; i<=n; i++)
        {
            x2 = x2 ^ i;
        }
        return x1^x2;
    }
}
